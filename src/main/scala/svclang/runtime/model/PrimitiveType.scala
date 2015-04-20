package svclang.runtime.model

case class PrimitiveType(name:String,
                         namespace:Option[String],
                         genericType:Option[TypeDef]) extends TypeDef
