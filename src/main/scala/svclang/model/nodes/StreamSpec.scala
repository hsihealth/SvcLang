package svclang.model.nodes

class StreamSpec(name:String, parent:Option[HasStreams]) extends ServiceNode(name,parent)
                                                                with HasSettings
                                                                with HasDocumentation
                                                                with HasMessageSelections
{

}

class InputStream(name:String,parent:Option[HasStreams]) extends StreamSpec(name,parent)
class OutputStream(name:String,parent:Option[HasStreams]) extends StreamSpec(name,parent)

