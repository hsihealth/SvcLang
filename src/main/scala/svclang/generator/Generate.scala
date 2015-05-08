package svclang.generator

import java.nio.file.Path

import svclang.Context
import svclang.compiler.Compile
import svclang.runtime.model.Service

import scala.util.Try

object Generate {

  def messages(implicit context:Context, renderer:ServiceRenderer) : Try[Iterable[Try[Path]]] = {
    compile(context).map{ svc =>
      new ServiceGenerator(svc).generateMessages().map{tryTuple =>
        tryTuple.map(_._1) //return just the path, at this level no need for the rendered element
      }
    }
  }

  private def compile(context:Context) : Try[Service]= {
    val source = context.settings.sourcePath
    Compile.serviceFile(source)
  }





}
