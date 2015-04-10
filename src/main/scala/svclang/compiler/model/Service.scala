package svclang.compiler.model

import scala.util.Try

class ServiceSection(name:String,parent:Option[Service]) extends ServiceNode(name,parent)
                                                            with HasDocumentation
                                                            with HasSettings
                                                            with HasTypeAliases
                                                            with HasMessages
                                                            with HasStreams
{
}

class Service(name:String, var sections:Vector[ServiceSection] = Vector()) extends ServiceSection(name,None) {

  def addSection(section:ServiceSection) : Unit = {
    sections = sections :+ section
  }

  override lazy val namespacedMessages = super.namespacedMessages ++ sections.flatMap{sect => sect.namespacedMessages}

  def getMessage(mRef:MessageRef) : Option[Message] = {
    //try for an exact match and if not found, we'll go looking
    namespacedMessages.get(mRef.fullName).orElse(namespacedMessages.values.find(mRef.matches))
  }
}