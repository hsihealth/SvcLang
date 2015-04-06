package svclang.compiler

import java.io.{FileInputStream, InputStream}

import org.antlr.v4.runtime._
import org.antlr.v4.runtime.tree._
import svclang.model.nodes.{Service, _}
import svclang.parser.{SvcLangBaseListener, SvcLangLexer, SvcLangParser}

import scala.collection.mutable
import scala.util.Try

object Compiler {
  def compileServiceFile(sourcePath:String):Try[Service] = {
    Try{
      new ANTLRInputStream(new FileInputStream(sourcePath))
    }.flatMap(compileService(_))
  }

  def compileService(source:InputStream):Try[Service] = {
    Try{
      new ANTLRInputStream(source)
    }.flatMap(compileService(_,silent = true))
  }

  def compileService(source:String):Try[Service] = {
    Try{
      new ANTLRInputStream(source)
    }.flatMap(compileService(_,silent = true))
  }

  def compileService(input: ANTLRInputStream, silent:Boolean = false) : Try[Service] = {
    Try{
      compileInput(input).left.get
    }
  }

  def compileMessageFile(sourcePath:String):Try[Map[String,Message]] = {
    Try{
      new ANTLRInputStream(new FileInputStream(sourcePath))
    }.flatMap(compileMessages(_))
  }

  def compileMessages(source:InputStream):Try[Map[String,Message]] = {
    Try{
      new ANTLRInputStream(source)
    }.flatMap(compileMessages(_,silent = true))
  }

  def compileMessages(source:String):Try[Map[String,Message]] = {
    Try{
      new ANTLRInputStream(source)
    }.flatMap(compileMessages(_,silent = true))
  }

  def compileMessages(input:ANTLRInputStream, silent:Boolean = false) : Try[Map[String,Message]] = {
    Try {
      compileInput(input).right.get
    }
  }

  private def compileInput(input:ANTLRInputStream, silent:Boolean = false) : Either[Service,Map[String,Message]] = {
    val errors = new CompilerErrorListener(silent)

    val lexer = new SvcLangLexer(input)
    lexer.removeErrorListeners()
    lexer.addErrorListener(errors)

    val tokens = new CommonTokenStream(lexer)

    val parser = new SvcLangParser(tokens)
    parser.removeErrorListeners()
    parser.addErrorListener(errors)

    val compiler = new Compiler(parser)
    val tree = parser.sourceFile()
    val walker = new ParseTreeWalker()
    walker.walk(compiler,tree)
    if (errors.hasErrors)
      throw new RuntimeException(errors.message)
    compiler.currentService match {
      case Some(service) => Left(service)
      case _ => Right(compiler.messages)
    }
  }
}

class Compiler(val parser:SvcLangParser) extends SvcLangBaseListener
                                            with ServiceCompiler
                                            with DocumentationExtractor
                                            with SettingsExtractor
                                            with IdentifierListExtractor
                                            with DefaultValueExtractor
                                            with MessageCompiler
                                            with TypeAliasCompiler
                                            with TypeSpecCompiler
                                            with FieldSpecCompiler
                                            with StreamCompiler
                                            with MessageSelectionCompiler
{

  protected val stack = mutable.Stack[ServiceNode]()


}

