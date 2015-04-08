package svclang.model.nodes

abstract class TypeSpec(name:String, parent:Option[ServiceNode] = None) extends ServiceNode(name, parent)

class Primitive(name:String) extends TypeSpec(name) with HasTypeSpec

class MessageRef(name:String, ns:Option[String], ctx:Option[HasMessages]) extends TypeSpec(name, ctx) {
  override def namespace = ns.getOrElse(super.namespace)
  def this(message: Message) = this(message.name, ns = Option(message.namespace), ctx = message.parent.map(_.asInstanceOf[HasMessages]))
  def context: Option[HasMessages] = this.parent.map(_.asInstanceOf[HasMessages])
  def matches(message:Message) : Boolean = {
    (ns == None && message.name.toLowerCase == name.toLowerCase) || //no explicit namespace specified, see if name matches
      (fullName.toLowerCase == message.fullName.toLowerCase) //an explicit namespace was provided, needs to match case insensitive
  }
}

class Enumeration extends TypeSpec("enum") with HasIdentifierList

class Union extends TypeSpec("union") with HasTypeSpecList




