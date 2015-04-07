package svclang.compiler

import svclang.model.nodes.{HasTypeAliases, TypeAlias}
import svclang.parser.SvcLangParser.TypeAliasContext

trait TypeAliasCompiler {
  this: Compiler =>

  override def enterTypeAlias(ctx: TypeAliasContext): Unit = {
    val alias = new TypeAlias(ctx.Identifier())
    stack.top match {
      case aliases:HasTypeAliases => aliases += alias
      case _ =>
    }
    stack.push(alias)
  }

  override def exitTypeAlias(ctx: TypeAliasContext): Unit = {
    stack.pop()
  }
}