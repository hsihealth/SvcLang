package svclang.generator

import svclang.runtime.model.MessageDef

trait ServiceRenderer {
  def renderMessage(message:MessageDef) : Iterable[RenderedElement]
}
