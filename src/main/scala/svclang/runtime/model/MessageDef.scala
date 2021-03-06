package svclang.runtime.model

sealed trait MessageDef extends ServiceElement with Documented with TypeAliasScope with FieldScope {
  override type Parent = MessageContext

  //Fields
  val sections:Seq[MessageSection]
  val extendedMessageReferences:Seq[MessageRef]

  //Derived properties
  lazy val extendedMessages : Iterable[Either[MessageRef,MessageDef]] =
    extendedMessageReferences.map(messageScope.get.findMessage)

  lazy val fields:Map[String,FieldDef] = {
    val inheritedFields = extendedMessages.filter(_.isRight).flatMap(_.right.get.fields)
    val myFields = fieldDefinitions ++ sections.flatMap(_.fieldDefinitions)
    (inheritedFields ++ myFields).toMap
  }

  def fieldList = fields.values

  //Methods
  def matches(ref:MessageRef):Boolean = matchesName(ref) && matchesNamespace(ref)

  protected def matchesName(ref:MessageRef) = this.name == ref.name
  protected def matchesNamespace(ref:MessageRef) = (this.namespace,ref.namespace) match {
    case (_,None) => true //If the namespace is not in the ref then namespace is ignored
    case (Some(us),Some(them)) => us.endsWith(them) //hey, we have matching namespaces! Isn't that cute...
    case _ => false //Get the #@$ out of my function, punk
  }

}

case class PartialMessage( name:String,
                           namespace:Option[String],
                           documentation:Option[String],
                           sections:Seq[MessageSection],
                           extendedMessageReferences:Seq[MessageRef],
                           typeAliases:Map[String,TypeAlias],
                           fieldDefinitions:Map[String,FieldDef])(context: => MessageContext) extends MessageDef {
  def parent = Some(context)
}


case class Command( name:String,
                    namespace:Option[String],
                    documentation:Option[String],
                    sections:Seq[MessageSection],
                    extendedMessageReferences:Seq[MessageRef],
                    typeAliases:Map[String,TypeAlias],
                    fieldDefinitions:Map[String,FieldDef],
                    emits:Seq[MessageRef],
                    failsWith:Seq[MessageRef]
                    )(context: => MessageContext)  extends MessageDef {
  def parent = Some(context)
}

case class Document( name:String,
                     namespace:Option[String],
                     documentation:Option[String],
                     sections:Seq[MessageSection],
                     extendedMessageReferences:Seq[MessageRef],
                     typeAliases:Map[String,TypeAlias],
                     fieldDefinitions:Map[String,FieldDef])(context: => MessageContext) extends MessageDef {
  def parent = Some(context)
}

case class Event( name:String,
                  namespace:Option[String],
                  documentation:Option[String],
                  sections:Seq[MessageSection],
                  extendedMessageReferences:Seq[MessageRef],
                  typeAliases:Map[String,TypeAlias],
                  fieldDefinitions:Map[String,FieldDef])(context: => MessageContext) extends MessageDef {
  def parent = Some(context)
}

case class Query( name:String,
                  namespace:Option[String],
                  documentation:Option[String],
                  sections:Seq[MessageSection],
                  extendedMessageReferences:Seq[MessageRef],
                  typeAliases:Map[String,TypeAlias],
                  fieldDefinitions:Map[String,FieldDef],
                  respondsWith:MessageRef)(context: => MessageContext) extends MessageDef {
  def parent = Some(context)
}

