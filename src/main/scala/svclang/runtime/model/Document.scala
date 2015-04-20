package svclang.runtime.model

case class Document( name:String,
                     namespace:Option[String],
                     documentation:Option[String],
                     sections:Seq[MessageSection],
                     extendedMessageReferences:Seq[MessageRef],
                     typeAliases:Map[String,TypeAlias],
                     fieldDefinitions:Map[String,FieldDef])(context: => MessageContext) extends MessageDef {
  def parent = Some(context)
}
