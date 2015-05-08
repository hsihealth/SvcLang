package svclang.generator

import svclang.runtime.model._

object ScalaServiceRenderer extends ServiceRenderer {
  def renderMessage(message:MessageDef) : Iterable[RenderedElement] = {
    val txt = message match {
      case m:PartialMessage => renderPartialMessage(m)
      case m:Event => renderEvent(m)
      case m:Document => renderDocument(m)
      case m:Command => renderCommand(m)
      case m:Query => renderQuery(m)
    }
    Seq(RenderedElement(message,format(txt)))
  }

  protected def renderPartialMessage(p:PartialMessage) = renderTrait(p)
  protected def renderEvent(e:Event) = renderCaseClass(e)
  protected def renderDocument(d:Document) = renderCaseClass(d)
  protected def renderCommand(c:Command) = renderCaseClass(c)
  protected def renderQuery(q:Query) = renderCaseClass(q)

  protected def renderTrait(implicit m:MessageDef) : String =
  s"""
  $packageDeclaration

  ${imports}trait $name$messageExtensions {${methods(m)}}
  """


  protected def renderCaseClass(implicit m:MessageDef) : String =
  s"""
  $packageDeclaration

  ${imports}case class $name(${parameters(m)})$messageExtensions
  """

  protected def format(rendered:String) = {
    new StringBuilder(rendered)
      .insert(0,"/* GENERATED - DO NOT MODIFY */")
      .lines.map(_.stripPrefix("  ")) //multiline strings include the spacing of the code
      .mkString("\n")
  }

  protected def imports(implicit m:MessageDef):String = {
    if (m.extendedMessages.nonEmpty) {
      val namespaces = m.extendedMessages.collect {
        case Right(md) if md.namespace.isDefined => md
      }.groupBy(_.namespace.get)

      namespaces.keys.map { ns =>
        s"import $ns.${messageImports(namespaces(ns))}\n"
      }.mkString + "\n"
    } else ""
  }

  protected def messageImports(messages:Iterable[MessageDef]) = messages.toList match {
    case head::Nil => head.name
    case _ => s"{${messages.map(_.name).mkString(",")}}"
  }

  protected def messageExtensions(implicit m:MessageDef): String ={
    if (m.extendedMessages.nonEmpty){
      s" extends ${m.extendedMessageReferences.map(_.name).mkString(" with ")}"
    } else ""
  }

  protected def packageDeclaration(implicit e:ServiceElement):String =
    s"package $namespace"

  protected def namespace(implicit e:ServiceElement):String =
    e.namespace.getOrElse("")

  protected def name(implicit e:ServiceElement):String = e.name

  protected def documentation(implicit d:Documented) =
    d.documentation.map(doc => s"/* $doc */").getOrElse("")

  protected def methods(message:MessageDef) =
    if (message.fieldList.nonEmpty){
      "\n" + message.fieldList.map { f => implicit val field = f
        s"\t$documentation\n$method"
      }.mkString(",\n") + "\n"
    } else ""

  protected def parameters(message:MessageDef) =
    if (message.fieldList.nonEmpty){
      "\n" + message.fieldList.map { f => implicit val field = f
        s"\t$documentation\n\t$fieldDef"
      }.mkString(",\n") + "\n"
    } else ""

  protected def method(implicit field: FieldDef) =
    s"\tdef $fieldDef"

  protected def fieldDef(implicit field:FieldDef) =
    s"$name: ${dataType(field)}$defaultAssignment"

  protected def dataType(implicit field:FieldDef) : String = field match {
    case f if f.required || f.dataType.isCollectionType =>
      dataType(f.dataType)
    case f => s"Option[${dataType(f.dataType)}]"
  }

  protected def dataType(implicit dataType:TypeDef) : String = {
    dataType match {
      case p:PrimitiveType if p.hasGenericType => s"${p.name.capitalize}[${this.dataType(p.genericType.get)}]"
      case u:Union => "Any"
      case e:Enumeration => "String"
      case _ => dataType.name.capitalize
    }
  }

  protected def defaultAssignment(implicit field:FieldDef) = {
    val dv = defaultValue(field)
    if (field.dataType.isCollectionType)
      s" = ${field.dataType.name.capitalize}()"
    else if (field.optional || dv.isDefined){
      s" = ${dv.getOrElse("None")}"
    } else ""
  }

  protected def defaultValue(implicit field:FieldDef):Option[String] =
    field.defaultValue.collect{
      case v if field.optional => s"Some($v)"
      case v => v
    }
}


