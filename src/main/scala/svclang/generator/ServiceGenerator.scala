package svclang.generator

import java.io.FileWriter
import java.nio.file.{Path, Paths}

import svclang.Context
import svclang.runtime.model._

import scala.util.Try


case class ServiceGenerator(service:Service)(implicit context:Context) {

  val settings = context.settings.generator

  type Namespace = String

  def generateMessages()(implicit renderer:ServiceRenderer) : Iterable[Try[(Path,RenderedElement)]] = {
    val rendered = renderMessages()(renderer)
    val outDir = Paths.get(settings.outputDirectory)
    rendered.map(writeElement(_,outDir))
  }

  def renderMessages()(implicit renderer:ServiceRenderer) : Iterable[RenderedElement] = {
    service.allMessages.map(renderer.renderMessage).flatten
  }


  private def writeElement(element:RenderedElement,outputDirectory:Path) : Try[(Path,RenderedElement)]  = {
    val folderPath = expandPath(
      outputDirectory,
      element
    )
    val filePath = expandPath(
      folderPath.resolve(s"${element.name}.${settings.outputFileExtension}"),
      element
    )
    folderPath.toFile.mkdirs()
    val writer = new FileWriter(filePath.toFile,false)
    Try{
      try{
        writer.write(element.renderedText)
      } finally {
        writer.close()
      }
      filePath -> element
    }
  }

  private def expandPath(path:Path,element:RenderedElement) = {
    Paths.get(
      path.toString.replace("$namespace",element.namespace.replace(".","/"))
        .replace("$name",element.name)
        .replace("$serviceName",element.serviceName)
    )
  }



}
