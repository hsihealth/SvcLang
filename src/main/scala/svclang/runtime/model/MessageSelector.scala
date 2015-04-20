package svclang.runtime.model

case class MessageSelector( pattern:String, namespace:Option[String] ) extends ServiceElement { val name = pattern; def parent = None }
