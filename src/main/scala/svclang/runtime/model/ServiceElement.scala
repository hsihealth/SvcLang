package svclang.runtime.model

trait ServiceElement {
  type Parent <: ServiceElement
  def parent: Option[Parent]

  lazy val root: ServiceElement = parent.map(_.root).getOrElse(this)
  lazy val messageScope:Option[MessageScope] = parent.filter(_.isInstanceOf[MessageScope]).map(_.asInstanceOf[MessageScope])
  lazy val fullName = namespace.map(ns=>s"$ns.").getOrElse("") + name

  //Common Fields
  val name: String
  val namespace:Option[String]
}