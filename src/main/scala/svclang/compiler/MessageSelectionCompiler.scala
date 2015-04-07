package svclang.compiler

import svclang.model.nodes.{MessageSelection, HasMessageSelections}
import svclang.parser.SvcLangParser.MessageSelectionPatternContext

trait MessageSelectionCompiler {
  this: Compiler =>

  override def enterMessageSelectionPattern(ctx:MessageSelectionPatternContext): Unit ={
      stack.top match {
        case parent:HasMessageSelections => parent += new MessageSelection(ctx.getText.trim(),Some(parent))
      }
  }
}
