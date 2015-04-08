package svclang.model.nodes

class MessageBase(name:String,parent:Option[HasMessages]) extends ServiceNode(name,parent)
                                                             with HasDocumentation
                                                             with HasTypeAliases
                                                             with HasMessageExtensions
                                                             with HasFieldSpecs


abstract class Message(name:String,parent:Option[HasMessages]) extends MessageBase(name,parent) {
  var sections : Vector[MessageSection] = Vector()
  def += (section:MessageSection) : Unit = sections = sections :+ section
}

class MessageSection(name:String, parent:Option[HasMessages]) extends MessageBase(name, parent)

class RequiredFieldsSection(parent:Option[HasMessages]) extends MessageSection("required", parent)

class PartialMessage(name:String,parent:Option[HasMessages]) extends Message(name, parent)

class Document(name:String,parent:Option[HasMessages]) extends Message(name, parent)

class Event(name:String,parent:Option[HasMessages]) extends Message(name, parent)

class Command(name:String, parent:Option[HasMessages]) extends Message(name, parent) {
  var emits:Vector[MessageRef] = Vector()
  var failsWith:Vector[MessageRef] = Vector()
  def addEmits(msg:MessageRef) : MessageRef = {
    emits = emits :+ msg
    msg
  }

  def addFailsWith(msg:MessageRef) : MessageRef = {
    failsWith = failsWith :+ msg
    msg
  }
}

class Query(name:String, parent:Option[HasMessages]) extends Message(name, parent) {
  var respondsWith:Option[MessageRef] = None
}

class FieldSpec(name:String, message:Option[Message], val required:Boolean = false) extends ServiceNode(name, message)
                                                                                    with HasTypeSpec
                                                                                    with HasDocumentation
                                                                                    with HasDefaultValue {
}

class MessageSelection(name:String,parent:Option[HasMessageSelections]) extends ServiceNode(name, parent)