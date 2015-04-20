package svclang.runtime.model

trait StreamDef extends ServiceElement with Documented {
  val messages:Seq[MessageSelector]
}
