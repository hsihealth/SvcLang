package svclang.compiler.model

abstract class TypeSpec(name:String, parent:Option[ServiceNode] = None) extends ServiceNode(name, parent)

class Primitive(name:String) extends TypeSpec(name) with HasTypeSpec

class MessageRef(name:String, ns:Option[String], ctx:Option[HasMessages]) extends TypeSpec(name, ctx) {
  val rawNamespace = ns

  override def namespace = rawNamespace.orElse(super.namespace)

  def this(message: Message) = this(message.name, ns = message.namespace, ctx = message.parent.map(_.asInstanceOf[HasMessages]))
}

class Enumeration extends TypeSpec("enum") with HasIdentifierList {
  def withValue(value:String) = withIdentifier(value).asInstanceOf[Enumeration]
}

class Union extends TypeSpec("union") with HasTypeSpecList {
  def withType(typeSpec:TypeSpec) = withTypeSpec(typeSpec).asInstanceOf[Union]
}




