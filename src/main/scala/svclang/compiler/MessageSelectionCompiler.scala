package svclang.compiler

import svclang.model.nodes.{MessageSelection, HasMessageSelections}
import svclang.parser.SvcLangParser.MessageSelectionPatternContext

trait MessageSelectionCompiler {
  this: Compiler =>

  override def enterMessageSelectionPattern(ctx:MessageSelectionPatternContext): Unit ={
      stack.top match {
        case sel:HasMessageSelections => sel += new MessageSelection(ctx.getText.trim())
      }
  }
}
