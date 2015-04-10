package svclang.compiler.listeners

import svclang.compiler.model.{FieldSpec, HasFieldSpecs}
import svclang.parser.SvcLangParser.FieldSpecContext

trait FieldSpecListener {
  this : SvcLangListener with MessageListener =>

  override def enterFieldSpec(ctx: FieldSpecContext): Unit = {
    val specRequired = ctx.Star() != null || inRequiredFieldsSection
    val specName = ctx.Identifier().getText.trim()
    val spec = new FieldSpec(specName,currentMessage,specRequired)
    stack.top match {
      case hasSpecs:HasFieldSpecs => hasSpecs.withField(spec)
      case _ =>
    }
    stack.push(spec)
  }
  override def exitFieldSpec(ctx:FieldSpecContext):Unit = { stack.pop() }
}
