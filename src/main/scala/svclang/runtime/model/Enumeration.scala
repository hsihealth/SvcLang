package svclang.runtime.model

case class Enumeration( name:String, namespace:Option[String], values:Seq[String]) extends TypeDef
