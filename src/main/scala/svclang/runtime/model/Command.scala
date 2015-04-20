package svclang.runtime.model

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
