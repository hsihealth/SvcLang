package svclang.compiler

import svclang.model.nodes._
import svclang.parser.SvcLangParser.TypeSpecContext

trait TypeSpecCompiler {
  this: Compiler =>

  override def enterTypeSpec(ctx: TypeSpecContext): Unit = {
    val spec = typeSpecFromCtx(ctx)
    stack.top match {
      case hts:HasTypeSpec => hts.typeSpec = Some(spec)
      case htsl: HasTypeSpecList => htsl += spec
      case _ => //noop
    }
    stack.push(spec)
  }

  override def exitTypeSpec(ctx: TypeSpecContext): Unit = {
    stack.pop()
  }

  //A more elegant solution would probably be to pimp TypeSpecContext
  //in such a way to allow pattern matching. Maybe someday, my sweet, maybe someday...
  private def typeSpecFromCtx(ctx:TypeSpecContext) : TypeSpec = {
    if (ctx.PrimitiveType() != null) {
      new Primitive(ctx.PrimitiveType().getText.trim())
    } else if (ctx.messageRef() != null) {
      new MessageRef(ctx.messageRef().Identifier().getText.trim())
    } else if (ctx.enumeration() != null) {
      new Enumeration()
    } else if (ctx.union() != null) {
      new Union()
    } else {
      throw new IllegalArgumentException("Could not determine the type spec type from the context")
    }
  }
}