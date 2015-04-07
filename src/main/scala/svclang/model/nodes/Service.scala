package svclang.model.nodes

class ServiceSection(name:String,parent:Option[Service]) extends ServiceNode(name,parent)
                                                            with HasDocumentation
                                                            with HasSettings
                                                            with HasTypeAliases
                                                            with HasMessages
                                                            with HasStreams
{
}

class Service(name:String,
              var sections:Vector[ServiceSection] = Vector()) extends ServiceSection(name,None) {

  def addSection(section:ServiceSection) : Unit = {
    sections = sections :+ section
  }

}