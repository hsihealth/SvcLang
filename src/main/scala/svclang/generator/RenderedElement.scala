package svclang.generator

import svclang.runtime.model._

case class RenderedElement(element:ServiceElement, renderedText:String) {
  def name = element.name
  def namespace = element.namespace.getOrElse("")
  def serviceName = element.root.name
}
