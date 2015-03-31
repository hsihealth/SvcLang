package svclang.parser

import java.io.FileInputStream

import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{CommonTokenStream, ANTLRInputStream}

object Parser {
  def parse(): Unit = {
    val input = new ANTLRInputStream(new FileInputStream("./samples/AccountReviews.svc"))
    val lexer = new SvcLangLexer(input)
    val tokens = new CommonTokenStream(lexer)
    val parser = new SvcLangParser(tokens)
    val walker = new ParseTreeWalker()
    val listener = new Parser(parser)
    val tree = parser.sourceFile()
    walker.walk(listener,tree)
  }
}

class Parser(val parser: SvcLangParser) extends SvcLangBaseListener {
  override def enterSourceFile(ctx:SvcLangParser.SourceFileContext) {
    println(ctx.getText())
  }
}