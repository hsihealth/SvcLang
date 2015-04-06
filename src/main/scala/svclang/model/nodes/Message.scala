package svclang.model.nodes

/**
 * Created by nathanstults on 4/2/15.
 */
class MessageBase(name:String) extends ServiceNode(name) with HasDocumentation
                                                            with HasTypeAliases
                                                            with HasMessageExtensions
                                                            with HasFieldSpecs {
}

abstract class Message(name:String) extends MessageBase(name) {
  var sections : Vector[MessageSection] = Vector()
  def += (section:MessageSection) : Unit = sections = sections :+ section
}

class MessageSection(name:String) extends MessageBase(name)
class RequiredFieldsSection extends MessageSection("required")

class PartialMessage(name:String) extends Message(name)

class Document(name:String) extends Message(name)

class Event(name:String) extends Message(name)

class Command(name:String) extends Message(name) {
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

class Query(name:String) extends Message(name) {
  var respondsWith:Option[MessageRef] = None
}

class FieldSpec(name:String, val required:Boolean = false) extends ServiceNode(name)
                                                           with HasTypeSpec
                                                           with HasDocumentation
                                                           with HasDefaultValue {
}

class MessageSelection(name:String) extends ServiceNode(name)