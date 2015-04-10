package svclang.compiler

import svclang.compiler.{model => parsed}
import svclang.runtime.{model => runtime}

class ServiceCompiler(val parsedService:parsed.Service) {
  import ServiceCompiler._

  private def p = parsedService

  def compile():runtime.Service = {
    ServiceToService(p)
  }
}

object ServiceCompiler {

  def ServiceToService(source:parsed.Service):runtime.Service = new runtime.Service(
    name = source.name,
    documentation = source.documentation,
    settings = source.settings,
    typeAliases = SortAndConvertMap(source.aliases,TypeAliasToTypeAlias),
    messages = SortAndConvertMap(source.messages,MessageToMessage),
    inputStreams = SortAndConvertList(source.streams.values.filter(_.isInstanceOf[parsed.InputStream]),InputStreamToInputStream),
    outputStreams = SortAndConvertList(source.streams.values.filter(_.isInstanceOf[parsed.OutputStream]),OutputStreamToOutputStream),
    sections = source.sections.map(ServiceSectionToServiceSection)
  )

  def SortAndConvertList[P<:parsed.ServiceNode,R<:runtime.Named](source:Iterable[P],convert:P=>R):Seq[R] =
    source.toSeq.sortBy(_.name).map(convert)

  def ServiceSectionToServiceSection(source:parsed.ServiceSection):runtime.ServiceSection = new runtime.ServiceSection(
    name = source.name,
    documentation = source.documentation,
    settings = source.settings,
    typeAliases = SortAndConvertMap(source.aliases,TypeAliasToTypeAlias),
    messages = SortAndConvertMap(source.messages,MessageToMessage),
    inputStreams = source.streams.values.filter(_.isInstanceOf[parsed.InputStream]).toSeq.sortBy(_.name).map(InputStreamToInputStream),
    outputStreams = source.streams.values.filter(_.isInstanceOf[parsed.OutputStream]).toSeq.sortBy(_.name).map(OutputStreamToOutputStream)
  )

  def InputStreamToInputStream(source:parsed.StreamSpec):runtime.InputStream = new runtime.InputStream(
    name = source.name,
    documentation = source.documentation,
    messages = source.messageSelections.sortBy(_.name).map(MessageSelectionToMessageSelector)
  )

  def OutputStreamToOutputStream(source:parsed.StreamSpec):runtime.OutputStream = new runtime.OutputStream(
    name = source.name,
    documentation = source.documentation,
    messages = source.messageSelections.sortBy(_.name).map(MessageSelectionToMessageSelector)
  )

  def MessageSelectionToMessageSelector(source:parsed.MessageSelection):runtime.MessageSelector = new runtime.MessageSelector(
    pattern = source.name
  )

  def TypeSpecToTypeDef(source:parsed.TypeSpec):Option[runtime.TypeDef] = Option(source).collect{
    case p:parsed.Primitive => new runtime.PrimitiveType(name = p.name, genericType = p.typeSpec.map(TypeSpecToTypeDef).flatten)
    case e:parsed.Enumeration => new runtime.Enumeration(name = e.name, values = e.ids.seq)
    case u:parsed.Union =>
      val defs = u.typeSpecs.map(s => TypeSpecToTypeDef(s)).flatten
      new runtime.Union(name = u.name, types = defs)
    case mr:parsed.MessageRef => MessageRefToMessageRef(mr)
  }

  def MessageSectionToMessageSection(source:parsed.MessageSection):runtime.MessageSection = new runtime.MessageSection(
    name = source.name,
    documentation = source.documentation,
    typeAliases = SortAndConvertMap(source.aliases,TypeAliasToTypeAlias),
    fields = SortAndConvertMap(source.fields,FieldSpecToFieldDef)
  )

  def TypeAliasToTypeAlias(source:parsed.TypeAlias):runtime.TypeAlias = new runtime.TypeAlias(
    source.name,
    source.documentation,
    baseType = source.typeSpec.map(TypeSpecToTypeDef).flatten.get
  )

  def FieldSpecToFieldDef(source:parsed.FieldSpec):runtime.FieldDef = new runtime.FieldDef(
    name = source.name,
    documentation = source.documentation,
    defaultValue = source.defaultValue,
    `type` = TypeSpecToTypeDef(source.typeSpec.get).get
  )

  def MessageRefToMessageRef(source:parsed.MessageRef):runtime.MessageRef = new runtime.MessageRef(
    name = source.name,
    namespace = source.rawNamespace
  )

  def PartialMessageToPartialMessage(source:parsed.PartialMessage):runtime.PartialMessage = new runtime.PartialMessage(
    name = source.name,
    documentation = source.documentation,
    sections = source.sections.map(MessageSectionToMessageSection),
    `extends` = source.extensions.map(MessageRefToMessageRef),
    typeAliases = SortAndConvertMap(source.aliases,TypeAliasToTypeAlias),
    fields = SortAndConvertMap(source.fields,FieldSpecToFieldDef)
  )

  def DocumentToDocument(source:parsed.Document):runtime.Document = new runtime.Document(
    name = source.name,
    documentation = source.documentation,
    sections = source.sections.map(MessageSectionToMessageSection),
    `extends` = source.extensions.map(MessageRefToMessageRef),
    typeAliases = SortAndConvertMap(source.aliases,TypeAliasToTypeAlias),
    fields = SortAndConvertMap(source.fields,FieldSpecToFieldDef)
  )

  def EventToEvent(source:parsed.Event):runtime.Event = new runtime.Event(
    name = source.name,
    documentation = source.documentation,
    sections = source.sections.map(MessageSectionToMessageSection),
    `extends` = source.extensions.map(MessageRefToMessageRef),
    typeAliases = SortAndConvertMap(source.aliases,TypeAliasToTypeAlias),
    fields = SortAndConvertMap(source.fields,FieldSpecToFieldDef)
  )

  def QueryToQuery(source:parsed.Query):runtime.Query = new runtime.Query(
    name = source.name,
    documentation = source.documentation,
    sections = source.sections.map(MessageSectionToMessageSection),
    `extends` = source.extensions.map(MessageRefToMessageRef),
    typeAliases = SortAndConvertMap(source.aliases,TypeAliasToTypeAlias),
    fields = SortAndConvertMap(source.fields,FieldSpecToFieldDef),
    respondsWith = MessageRefToMessageRef(source.respondsWith.get)
  )

  def CommandToCommand(source:parsed.Command):runtime.Command = new runtime.Command(
    name = source.name,
    documentation = source.documentation,
    sections = source.sections.map(MessageSectionToMessageSection),
    `extends` = source.extensions.map(MessageRefToMessageRef),
    typeAliases = SortAndConvertMap(source.aliases,TypeAliasToTypeAlias),
    fields = SortAndConvertMap(source.fields,FieldSpecToFieldDef),
    emits = source.emits.map(MessageRefToMessageRef).sortBy(_.name).seq,
    failsWith = source.failsWith.map(MessageRefToMessageRef).sortBy(_.name).seq
  )

  def MessageToMessage(source:parsed.Message):runtime.MessageDef = source match {
    case pm:parsed.PartialMessage => PartialMessageToPartialMessage(pm)
    case document:parsed.Document => DocumentToDocument(document)
    case event:parsed.Event => EventToEvent(event)
    case query:parsed.Query => QueryToQuery(query)
    case command:parsed.Command => CommandToCommand(command)
  }

  def SortAndConvertMap[P<:parsed.ServiceNode,R<:runtime.Named](source:Map[String,P],convert:P=>R):Map[String,R] =
    source.values.toList.sortBy(_.name).map(convert).map(a=>a.name->a).toMap

}

