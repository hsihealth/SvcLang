package svclang.compiler

import svclang.compiler.{model => parsed}
import svclang.runtime.{model => runtime}

import scala.language.implicitConversions

class ServiceCompiler(val parsedService:parsed.Service) {
  import ServiceCompiler._

  private def p = parsedService

  def compile():runtime.Service = {
    ServiceToService(p)
  }
}

object ServiceCompiler {
  implicit def StringToOption(string:String):Option[String] = if(string.trim().isEmpty) None else Some(string.trim())

  def ServiceToService(source:parsed.Service):runtime.Service = {
    lazy val svc: runtime.Service = new runtime.Service(
      name = source.name,
      namespace = source.namespace,
      documentation = source.documentation,
      settings = source.settings,
      typeAliases = SortAndConvertMap(source.aliases, TypeAliasToTypeAlias(svc,_:parsed.TypeAlias)),
      messages = SortAndConvertMap(source.namespacedMessages, MessageToMessage(svc,_:parsed.Message)),
      inputStreams = SortAndConvertList(source.streams.values.filter(_.isInstanceOf[parsed.InputStream]), InputStreamToInputStream(svc,_:parsed.StreamSpec)),
      outputStreams = SortAndConvertList(source.streams.values.filter(_.isInstanceOf[parsed.OutputStream]), OutputStreamToOutputStream(svc,_:parsed.StreamSpec)),
      sections = source.sections.map(ServiceSectionToServiceSection(_:parsed.ServiceSection)(svc))
    )

    svc
  }

  def ServiceSectionToServiceSection(source:parsed.ServiceSection)(service: => runtime.Service):runtime.ServiceSection = {
    lazy val sct : runtime.ServiceSection = new runtime.ServiceSection(
      name = source.name,
      namespace = source.namespace,
      documentation = source.documentation,
      settings = source.settings,
      typeAliases = SortAndConvertMap(source.aliases, TypeAliasToTypeAlias(sct,_:parsed.TypeAlias)),
      messages = SortAndConvertMap(source.namespacedMessages, MessageToMessage(sct,_:parsed.Message)),
      inputStreams = SortAndConvertList(source.streams.values.filter(_.isInstanceOf[parsed.InputStream]), InputStreamToInputStream(sct,_:parsed.StreamSpec)),
      outputStreams = SortAndConvertList(source.streams.values.filter(_.isInstanceOf[parsed.OutputStream]), OutputStreamToOutputStream(sct,_:parsed.StreamSpec))
    )(service)

    sct
  }

  def InputStreamToInputStream(context: => runtime.StreamContext, source:parsed.StreamSpec):runtime.InputStream = {
    lazy val stream = new runtime.InputStream(
      name = source.name,
      namespace = source.namespace,
      documentation = source.documentation,
      messages = source.messageSelections.sortBy(_.name).map(MessageSelectionToMessageSelector)
    )(context)

    stream
  }

  def OutputStreamToOutputStream(context: => runtime.StreamContext, source:parsed.StreamSpec):runtime.OutputStream = {
    lazy val stream = new runtime.OutputStream(
      name = source.name,
      namespace = source.namespace,
      documentation = source.documentation,
      messages = source.messageSelections.sortBy(_.name).map(MessageSelectionToMessageSelector)
    )(context)

    stream
  }
  def MessageSelectionToMessageSelector(source:parsed.MessageSelection):runtime.MessageSelector = new runtime.MessageSelector(
    pattern = source.name,
    namespace = source.namespace
  )

  def TypeSpecToTypeDef(source:parsed.TypeSpec):Option[runtime.TypeDef] = Option(source).collect{
    case p:parsed.Primitive => new runtime.PrimitiveType(name = p.name, namespace = p.namespace, genericType = p.typeSpec.map(TypeSpecToTypeDef).flatten)
    case e:parsed.Enumeration => new runtime.Enumeration(name = e.name, namespace = e.namespace, values = e.ids.seq)
    case u:parsed.Union =>
      val defs = u.typeSpecs.map(s => TypeSpecToTypeDef(s)).flatten
      new runtime.Union(name = u.name, namespace = u.namespace, types = defs)
    case mr:parsed.MessageRef => MessageRefToMessageRef(mr)
  }

  def MessageSectionToMessageSection(message: => runtime.MessageDef, source:parsed.MessageSection):runtime.MessageSection = {
    lazy val section : runtime.MessageSection = new runtime.MessageSection(
      name = source.name,
      namespace = source.namespace,
      documentation = source.documentation,
      typeAliases = SortAndConvertMap(source.aliases, TypeAliasToTypeAlias(section,_:parsed.TypeAlias)),
      fieldDefinitions = SortAndConvertMap(source.fields, FieldSpecToFieldDef(section,_:parsed.FieldSpec))
    )(message)

    section
  }

  def TypeAliasToTypeAlias(scope: => runtime.TypeAliasScope, source:parsed.TypeAlias):runtime.TypeAlias = new runtime.TypeAlias(
    source.name,
    source.namespace,
    source.documentation,
    baseType = source.typeSpec.map(TypeSpecToTypeDef).flatten.get
  )(scope)

  def FieldSpecToFieldDef(context: => runtime.FieldScope, source:parsed.FieldSpec):runtime.FieldDef = {
    new runtime.FieldDef(
      name = source.name,
      namespace = source.namespace,
      documentation = source.documentation,
      defaultValue = source.defaultValue,
      dataTypeDefinition = TypeSpecToTypeDef(source.typeSpec.get).get,
      required = source.required
    )(context)
  }

  def MessageRefToMessageRef(source:parsed.MessageRef):runtime.MessageRef = new runtime.MessageRef(
    name = source.name,
    namespace = source.rawNamespace
  )

  def PartialMessageToPartialMessage(context: => runtime.MessageContext, source:parsed.PartialMessage):runtime.PartialMessage = {
    lazy val message : runtime.PartialMessage = new runtime.PartialMessage(
      name = source.name,
      namespace = source.namespace,
      documentation = source.documentation,
      sections = source.sections.map(MessageSectionToMessageSection(message,_)),
      extendedMessageReferences = source.extensions.map(MessageRefToMessageRef),
      typeAliases = SortAndConvertMap(source.aliases, TypeAliasToTypeAlias(message,_:parsed.TypeAlias)),
      fieldDefinitions = SortAndConvertMap(source.fields, FieldSpecToFieldDef(message,_:parsed.FieldSpec))
    )(context)

    message
  }

  def DocumentToDocument(context: => runtime.MessageContext, source:parsed.Document):runtime.Document = {
    lazy val message : runtime.Document = new runtime.Document(
      name = source.name,
      namespace = source.namespace,
      documentation = source.documentation,
      sections = source.sections.map(MessageSectionToMessageSection(message,_)),
      extendedMessageReferences = source.extensions.map(MessageRefToMessageRef),
      typeAliases = SortAndConvertMap(source.aliases, TypeAliasToTypeAlias(message,_:parsed.TypeAlias)),
      fieldDefinitions = SortAndConvertMap(source.fields, FieldSpecToFieldDef(message,_:parsed.FieldSpec))
    )(context)

    message
  }
  def EventToEvent(context: => runtime.MessageContext, source:parsed.Event):runtime.Event = {
    lazy val message : runtime.Event = new runtime.Event(
      name = source.name,
      namespace = source.namespace,
      documentation = source.documentation,
      sections = source.sections.map(MessageSectionToMessageSection(message,_)),
      extendedMessageReferences = source.extensions.map(MessageRefToMessageRef),
      typeAliases = SortAndConvertMap(source.aliases, TypeAliasToTypeAlias(message,_:parsed.TypeAlias)),
      fieldDefinitions = SortAndConvertMap(source.fields, FieldSpecToFieldDef(message,_:parsed.FieldSpec))
    )(context)

    message
  }

  def QueryToQuery(context: => runtime.MessageContext, source:parsed.Query):runtime.Query = {
    lazy val message : runtime.Query = new runtime.Query(
      name = source.name,
      namespace = source.namespace,
      documentation = source.documentation,
      sections = source.sections.map(MessageSectionToMessageSection(message,_)),
      extendedMessageReferences = source.extensions.map(MessageRefToMessageRef),
      typeAliases = SortAndConvertMap(source.aliases, TypeAliasToTypeAlias(message,_:parsed.TypeAlias)),
      fieldDefinitions = SortAndConvertMap(source.fields, FieldSpecToFieldDef(message,_:parsed.FieldSpec)),
      respondsWith = MessageRefToMessageRef(source.respondsWith.get)
    )(context)

    message
  }

  def CommandToCommand(context: => runtime.MessageContext, source:parsed.Command):runtime.Command = {
    lazy val message : runtime.Command = new runtime.Command(
      name = source.name,
      namespace = source.namespace,
      documentation = source.documentation,
      sections = source.sections.map(MessageSectionToMessageSection(message,_)),
      extendedMessageReferences = source.extensions.map(MessageRefToMessageRef),
      typeAliases = SortAndConvertMap(source.aliases, TypeAliasToTypeAlias(message,_:parsed.TypeAlias)),
      fieldDefinitions = SortAndConvertMap(source.fields, FieldSpecToFieldDef(message,_:parsed.FieldSpec)),
      emits = source.emits.map(MessageRefToMessageRef).sortBy(_.name).seq,
      failsWith = source.failsWith.map(MessageRefToMessageRef).sortBy(_.name).seq
    )(context)

    message
  }

  def MessageToMessage(context: => runtime.MessageContext, source:parsed.Message):runtime.MessageDef = source match {
    case pm:parsed.PartialMessage => PartialMessageToPartialMessage(context,pm)
    case document:parsed.Document => DocumentToDocument(context,document)
    case event:parsed.Event => EventToEvent(context,event)
    case query:parsed.Query => QueryToQuery(context,query)
    case command:parsed.Command => CommandToCommand(context,command)
  }

  def SortAndConvertMap[P<:parsed.ServiceNode,R<:runtime.ServiceElement](source:Map[String,P],convert:P=>R):Map[String,R] =
    source.values.toList.sortBy(_.name).map(convert).map(a=>a.name->a).toMap

  def SortAndConvertList[P<:parsed.ServiceNode,R<:runtime.ServiceElement](source:Iterable[P],convert:P=>R):Seq[R] =
    source.toSeq.sortBy(_.name).map(convert)

}

