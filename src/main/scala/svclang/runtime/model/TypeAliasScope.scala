package svclang.runtime.model

trait TypeAliasScope extends ServiceElement {
  val typeAliases:Map[String,TypeAlias]

  lazy val typeAliasScope : Option[TypeAliasScope] = parent.filter(_.isInstanceOf[TypeAliasScope]).map(_.asInstanceOf[TypeAliasScope])

  def findTypeAlias(name:String):Option[TypeAlias] = {
    typeAliases.values.find(_.name == name) match {
      case None => typeAliasScope.map(_.findTypeAlias(name)).getOrElse(None)
      case alias => alias
    }
  }
}
