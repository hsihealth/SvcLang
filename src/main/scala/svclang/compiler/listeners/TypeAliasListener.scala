package svclang.compiler.listeners

import svclang.compiler.model.{HasTypeAliases, TypeAlias}
import svclang.parser.SvcLangParser.TypeAliasContext

trait TypeAliasListener {
  this: SvcLangListener =>

  override def enterTypeAlias(ctx: TypeAliasContext): Unit = {
    val alias = new TypeAlias(ctx.Identifier())
    stack.top match {
      case aliases:HasTypeAliases => aliases withAlias alias
      case _ =>
    }
    stack.push(alias)
  }

  override def exitTypeAlias(ctx: TypeAliasContext): Unit = {
    stack.pop()
  }
}