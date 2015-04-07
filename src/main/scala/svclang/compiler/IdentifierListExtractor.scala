package svclang.compiler

import svclang.model.nodes.{MessageRef, HasMessageExtensions, HasIdentifierList}
import svclang.parser.SvcLangParser.IdentifierListContext

import scala.collection.JavaConversions._

trait IdentifierListExtractor  {
  this : Compiler =>

  override def enterIdentifierList(ctx: IdentifierListContext): Unit = {
    stack.top match {
      case msgExt:HasMessageExtensions => ctx.Identifier().foreach{ id=>
        msgExt += new MessageRef(id)
      }
      case idl:HasIdentifierList => ctx.Identifier().foreach(idl += _)
      case _ =>
    }
  }
}
