package svclang.compiler

import java.io.{InputStream, FileInputStream}

import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{CommonTokenStream, ANTLRInputStream}
import svclang.compiler.listeners.{SvcLangListener, CompilerErrorListener}
import svclang.compiler.model.{Message, Service}
import svclang.parser.{SvcLangParser, SvcLangLexer}

import scala.util.Try

object Parse {
  def serviceFile(sourcePath:String):Try[Service] = {
    Try{
      new ANTLRInputStream(new FileInputStream(sourcePath))
    }.flatMap(service(_))
  }

  def service(source:InputStream):Try[Service] = {
    Try{
      new ANTLRInputStream(source)
    }.flatMap(service(_,silent = true))
  }

  def service(source:String):Try[Service] = {
    Try{
      new ANTLRInputStream(source)
    }.flatMap(service(_,silent = true))
  }

  def service(input: ANTLRInputStream, silent:Boolean = false) : Try[Service] = {
    Try{
      parseInput(input).get
    }
  }

  def messageFile(sourcePath:String, service:Option[Service] = None):Try[Map[String,Message]] = {
    Try{
      new ANTLRInputStream(new FileInputStream(sourcePath))
    }.flatMap(messages(_,service, silent = false))
  }

  def messages(source:InputStream, service:Option[Service]):Try[Map[String,Message]] = {
    Try{
      new ANTLRInputStream(source)
    }.flatMap(messages(_,service,silent = true))
  }

  def messages(source:String,service:Option[Service] = None):Try[Map[String,Message]] = {
    Try{
      new ANTLRInputStream(source)
    }.flatMap(messages(_,service,silent = true))
  }

  def messages(input:ANTLRInputStream, service:Option[Service], silent:Boolean) : Try[Map[String,Message]] = {
    Try {
      val svc = service.orElse(Some(new Service("")))
      parseInput(input,svc,silent).get.namespacedMessages
    }
  }

  private def parseInput(input:ANTLRInputStream, service:Option[Service] = None, silent:Boolean = false) : Option[Service] = {
    val errors = new CompilerErrorListener(silent)
    val lexer = new SvcLangLexer(input)
    lexer.removeErrorListeners()
    lexer.addErrorListener(errors)
    val tokens = new CommonTokenStream(lexer)
    val parser = new SvcLangParser(tokens)
    parser.removeErrorListeners()
    parser.addErrorListener(errors)
    val listener = new SvcLangListener(parser,service)
    val tree = parser.sourceFile()
    val walker = new ParseTreeWalker()
    walker.walk(listener,tree)
    if (errors.hasErrors)
      throw new RuntimeException(errors.message)
    listener.service()
  }
}