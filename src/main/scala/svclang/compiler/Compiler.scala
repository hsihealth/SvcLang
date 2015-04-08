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
      compileInput(input).get
    }
  }

  def compileMessageFile(sourcePath:String, service:Option[Service] = None):Try[Map[String,Message]] = {
    Try{
      new ANTLRInputStream(new FileInputStream(sourcePath))
    }.flatMap(compileMessages(_,service, silent = false))
  }

  def compileMessages(source:InputStream, service:Option[Service]):Try[Map[String,Message]] = {
    Try{
      new ANTLRInputStream(source)
    }.flatMap(compileMessages(_,service,silent = true))
  }

  def compileMessages(source:String,service:Option[Service] = None):Try[Map[String,Message]] = {
    Try{
      new ANTLRInputStream(source)
    }.flatMap(compileMessages(_,service,silent = true))
  }

  def compileMessages(input:ANTLRInputStream, service:Option[Service], silent:Boolean) : Try[Map[String,Message]] = {
    Try {
      val svc = service.orElse(Some(new Service("")))
      compileInput(input,svc,silent).get.namespacedMessages
    }
  }

  private def compileInput(input:ANTLRInputStream, service:Option[Service] = None, silent:Boolean = false) : Option[Service] = {
    val errors = new CompilerErrorListener(silent)
    val lexer = new SvcLangLexer(input)
    lexer.removeErrorListeners()
    lexer.addErrorListener(errors)
    val tokens = new CommonTokenStream(lexer)
    val parser = new SvcLangParser(tokens)
    parser.removeErrorListeners()
    parser.addErrorListener(errors)
    val compiler = new Compiler(parser,service)
    val tree = parser.sourceFile()
    val walker = new ParseTreeWalker()
    walker.walk(compiler,tree)
    if (errors.hasErrors)
      throw new RuntimeException(errors.message)
    compiler.currentService
  }
}

class Compiler(val parser:SvcLangParser,service:Option[Service] = None) extends SvcLangBaseListener
                                                                           with ServiceCompiler
                                                                           with DocumentationExtractor
                                                                           with SettingsExtractor
                                                                           with IdentifierListExtractor
                                                                           with DefaultValueExtractor
                                                                           with MessageRefListExtractor
                                                                           with MessageCompiler
                                                                           with TypeAliasCompiler
                                                                           with TypeSpecCompiler
                                                                           with FieldSpecCompiler
                                                                           with StreamCompiler
                                                                           with MessageSelectionCompiler
{
  implicit def TerminalNodeToString(in:TerminalNode) : String = in.getText.trim()

  protected val stack = mutable.Stack[ServiceNode]()
  //If a service is provided, put it into scope
  service.foreach(beginService)

}

