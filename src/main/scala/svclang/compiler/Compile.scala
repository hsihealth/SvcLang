package svclang.compiler

import java.io.InputStream

import svclang.runtime.{model=>runtime}
import svclang.compiler.{model=>parsed}

import scala.util.Try

object Compile {
  def serviceFile(sourcePath:String):Try[runtime.Service] = {
    Parse.serviceFile(sourcePath).map(compile).flatten
  }

  def service(source:InputStream):Try[runtime.Service] = {
    Parse.service(source).map(compile).flatten
  }

  def service(source:String):Try[runtime.Service] = {
    Parse.service(source).map(compile).flatten
  }

  private def compile(parsedService:parsed.Service):Try[runtime.Service] = {
    Try(new ServiceCompiler(parsedService).compile())
  }
}