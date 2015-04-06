package svclang.model.nodes

/**
 * Created by nathanstults on 4/1/15.
 */
abstract class TypeSpec(name:String) extends ServiceNode(name)

class Primitive(name:String) extends TypeSpec(name) with HasTypeSpec

class MessageRef(name:String) extends TypeSpec(name) {
  def this(message:Message) = this(message.name)
}
class Enumeration extends TypeSpec("enum") with HasIdentifierList

class Union extends TypeSpec("union") with HasTypeSpecList




