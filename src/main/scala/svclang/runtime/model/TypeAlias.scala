package svclang.runtime.model

case class TypeAlias( name:String,
                      namespace:Option[String],
                      documentation:Option[String],
                      baseType:TypeDef)(scope: => TypeAliasScope) extends Documented {
  override type Parent = TypeAliasScope
  def parent = Some(scope)
}
