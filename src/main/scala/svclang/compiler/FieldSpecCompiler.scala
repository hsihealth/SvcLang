package svclang.compiler

import svclang.model.nodes._
import svclang.parser.SvcLangParser.{FieldSpecContext, IdentifierListContext}

import scala.collection.JavaConversions._

trait FieldSpecCompiler {
  this : Compiler with MessageCompiler =>

  override def enterFieldSpec(ctx: FieldSpecContext): Unit = {
    val specRequired = ctx.Star() != null || inRequiredFieldsSection
    val specName = ctx.Identifier().getText.trim()
    val spec = new FieldSpec(specName,currentMessage,specRequired)
    stack.top match {
      case hasSpecs:HasFieldSpecs => hasSpecs += spec
      case _ =>
    }
    stack.push(spec)
  }
  override def exitFieldSpec(ctx:FieldSpecContext):Unit = { stack.pop() }
}
