package svclang.model.nodes

class StreamSpec(name:String) extends ServiceNode(name)
                                 with HasSettings
                                 with HasDocumentation
                                 with HasMessageSelections
{

}

class InputStream(name:String) extends StreamSpec(name)
class OutputStream(name:String) extends StreamSpec(name)

