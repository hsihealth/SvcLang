package svclang.generator

import java.io.FileWriter
import java.net.URL
import java.nio.file.{Path, Paths}

import org.clapper.scalasti._
import svclang.runtime.model._
import svclang.{Context, TemplateGroupSettings}

import scala.util.Try

case class ServiceGenerator(service:Service)(implicit context:Context) {

  val settings = context.settings.generator
  val templates = settings.templates
  val messageSettings = templates.messages
  val templateGroup : STGroup = settings.templateGroupType match {
    case "file" | "resource" => STGroupFile(settings.templateGroupPath)
    case "directory" => STGroupDir(settings.templateGroupPath)
    case "url" => STGroupFile(new URL(settings.templateGroupPath))
    case _ => throw new IllegalArgumentException(s"An invalid templateGroupType was specified in configuration (${settings.templateGroupType}). Must be one of: file, resource, directory or url")
  }

  type Namespace = String

  def generateMessages() : Iterable[Try[(Path,RenderedElement[_])]] = {
    val rendered = renderMessages()
    val baseDir = Paths.get(settings.outputDirectory).resolve(messageSettings.outputDirectory)
    rendered.map(writeElement(_,baseDir))
  }

  def renderMessages() : Iterable[RenderedElement[_]] = {
    service.allMessages.map(renderMessage).flatten
  }

  private def renderMessage(message:MessageDef) : Iterable[RenderedElement[_]] = {
    val t = messageSettings
    message match {
      case m:PartialMessage => renderMessage(m,t.partialMessages)
      case m:Event => renderMessage(m,t.events)
      case m:Document => renderMessage(m,t.documents)
      case m:Command => renderMessage(m,t.commands)
      case m:Query => renderMessage(m,t.queries)
    }
  }

  private def renderMessage[T<:MessageDef](message:T,settings:TemplateGroupSettings) : Iterable[RenderedElement[T]] = {
    settings.templates.keys.map{ tname =>
      new RenderedMessage(
        element = message,
        renderedText = renderTemplate(message,tname),
        requestedFileName = settings.templates(tname),
        requestedDirectory = settings.outputDirectory
      )
    }
  }

  private def renderTemplate(context:ServiceElement,templateName:String) : Try[String] =
    template(templateName).map { t =>
      t.set("context", context)
      t.render()
    }

  private def template(name:String) : Try[ST] = templateGroup.instanceOf(name)

  private def writeElement(element:RenderedElement[_],baseDirectory:Path) : Try[(Path,RenderedElement[_])]  = {
    val folderPath = expandPath(
      baseDirectory.resolve(element.requestedDirectory),
      element
    )
    val filePath = expandPath(
      folderPath.resolve(s"${element.requestedFileName}.${settings.outputFileExtension}"),
      element
    )
    element.renderedText.map{ txt =>
      folderPath.toFile.mkdirs()
      val writer = new FileWriter(filePath.toFile,false)
      Try{
        try{
          writer.write(txt)
        } finally {
          writer.close()
        }
      }
      filePath -> element.asInstanceOf[RenderedElement[ServiceElement]]
    }
  }

  private def expandPath(path:Path,element:RenderedElement[_]) = {
    Paths.get(
      path.toString.replace("$namespace",element.namespace.replace(".","/"))
        .replace("$name",element.name)
        .replace("$serviceName",element.serviceName)
    )
  }

}
