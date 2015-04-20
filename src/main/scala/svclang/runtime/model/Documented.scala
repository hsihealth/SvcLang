package svclang.runtime.model

trait Documented extends ServiceElement{
  val documentation:Option[String]
}
