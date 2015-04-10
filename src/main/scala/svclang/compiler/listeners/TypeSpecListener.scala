package svclang.compiler.listeners

import svclang.compiler.model._
import svclang.parser.SvcLangParser.TypeSpecContext

trait TypeSpecListener {
  this: SvcLangListener with MessageListener =>

  override def enterTypeSpec(ctx: TypeSpecContext): Unit = {
    val spec = typeSpecFromCtx(ctx)
    stack.top match {
      case hts:HasTypeSpec => hts.withTypeSpec(Some(spec))
      case htsl: HasTypeSpecList => htsl withTypeSpec spec
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
      new Primitive(ctx.PrimitiveType())
    } else if (ctx.messageRef() != null) {
      val namespace : Option[String] = Option(ctx.messageRef().namespace()).map(_.getText.trim())
      val msgName : String = ctx.messageRef().Identifier()
      new MessageRef(msgName, ns = namespace, ctx = currentMessageTarget)
    } else if (ctx.enumeration() != null) {
      new Enumeration()
    } else if (ctx.union() != null) {
      new Union()
    } else {
      throw new IllegalArgumentException("Could not determine the type spec type from the context")
    }
  }
}