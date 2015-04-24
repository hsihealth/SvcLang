package svclang.generator

import svclang.runtime.model._
import scala.util.Try

sealed trait RenderedElement[T<:AnyRef with ServiceElement] {
  val element:T
  val renderedText:Try[String]

  def name = element.name
  def namespace = element.namespace.getOrElse("")
  def serviceName = element.root.name
  def requestedFileName:String
  def requestedDirectory:String
}

case class RenderedMessage[T<:MessageDef](
                                           element:T,
                                           renderedText:Try[String],
                                           requestedFileName:String,
                                           requestedDirectory:String) extends RenderedElement[T]
