package svclang.runtime.model

trait SettingsScope extends ServiceElement{
  val settings:Map[String,String]
}
