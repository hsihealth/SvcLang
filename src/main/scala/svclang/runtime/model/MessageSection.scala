package svclang.runtime.model

case class MessageSection( name:String,
                           namespace:Option[String],
                           documentation:Option[String],
                           typeAliases:Map[String,TypeAlias],
                           fieldDefinitions:Map[String,FieldDef])(msg: => MessageDef) extends Documented with TypeAliasScope with FieldScope {
  override type Parent = MessageDef
  def parent = Some(msg)
}
