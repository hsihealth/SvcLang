package svclang.compiler.listeners

import svclang.compiler.model.{HasMessageSelections, MessageSelection}
import svclang.parser.SvcLangParser.MessageSelectionPatternContext

trait MessageSelectionListener {
  this: SvcLangListener =>

  override def enterMessageSelectionPattern(ctx:MessageSelectionPatternContext): Unit ={
      stack.top match {
        case parent:HasMessageSelections => parent withMessageSelection new MessageSelection(ctx.getText.trim(),Some(parent))
      }
  }
}
