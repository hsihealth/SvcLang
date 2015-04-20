package svclang.runtime.model

trait StreamScope extends ServiceElement{
  val inputStreams:Seq[StreamDef]
  val outputStreams:Seq[StreamDef]
}
