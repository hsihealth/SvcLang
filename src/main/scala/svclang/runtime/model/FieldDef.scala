package svclang.runtime.model

case class FieldDef( name:String,
                     namespace:Option[String],
                     documentation:Option[String],
                     defaultValue:Option[String],
                     dataTypeDefinition:TypeDef,
                     required:Boolean)(scope: => FieldScope) extends Documented {


  override type Parent = FieldScope
  def parent = Some(scope)

  lazy val message : Option[MessageDef] = parent.flatMap(_.message)
  lazy val typeAliasScope: Option[TypeAliasScope] = parent.filter(_.isInstanceOf[TypeAliasScope]).map(_.asInstanceOf[TypeAliasScope])
  lazy val typeAlias : Option[TypeAlias] = typeAliasScope.flatMap(_.findTypeAlias(dataTypeDefinition.fullName))
  lazy val dataType:TypeDef = typeAlias.map(_.baseType).getOrElse(dataTypeDefinition)

  def hasDefaultValue = defaultValue.isDefined
  def optional = !required

}
