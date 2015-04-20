package svclang.runtime.model

trait FieldScope extends ServiceElement {
  val fieldDefinitions:Map[String,FieldDef]

  lazy val fieldScope:Option[FieldScope] = parent.filter(_.isInstanceOf[FieldScope]).map(_.asInstanceOf[FieldScope])
  lazy val message:Option[MessageDef] = this match {
    case self if self.isInstanceOf[MessageDef] => Some(self.asInstanceOf[MessageDef])
    case _ => fieldScope.flatMap(_.message)
  }
}
