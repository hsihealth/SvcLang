package svclang.model.nodes

class Service(name:String,
              var sections:Vector[ServiceSection] = Vector()) extends ServiceSection(name) {

  def addSection(section:ServiceSection) : Unit = {
    sections = sections :+ section
  }

}