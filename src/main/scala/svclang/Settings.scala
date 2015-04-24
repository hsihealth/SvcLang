package svclang

import com.typesafe.config.Config
import scala.collection.JavaConversions._

class Settings(config:Config){
  val sourcePath = config.getString("svclang.sourcePath")
  val generator = new GeneratorSettings(config.getConfig("svclang.generator"))
}

class GeneratorSettings(rootGen:Config) {
  val target = rootGen.getString("target")
  val config = rootGen.getConfig(target).withFallback(rootGen)

  val outputDirectory = config.getString("outputDirectory")

  val outputFileExtension = config.getString("outputFileExtension")
  val templateGroupType = config.getString("templateGroupType")
  val templateGroupPath = config.getString("templateGroupPath")

  val templates = new TemplatesSettings(config.getConfig("templates"))

}

class TemplatesSettings(config:Config) {
  val services = new TemplateGroupSettings(config.getConfig("services"))
  val streams = new TemplateGroupSettings(config.getConfig("streams"))
  val messages = new MessagesSettings(config.getConfig("messages"))
}

class TemplateGroupSettings(config:Config) {
  val outputDirectory = config.getString("outputDirectory")
  val templates : Map[String,String] = config.getObject("templates").entrySet().map( e =>
    (e.getKey() -> e.getValue().unwrapped().toString())
  ).toMap
}

class MessagesSettings(config:Config) {
  val outputDirectory = config.getString("outputDirectory")
  val partialMessages = new TemplateGroupSettings(config.getConfig("partialMessages"))
  val documents = new TemplateGroupSettings(config.getConfig("documents"))
  val events = new TemplateGroupSettings(config.getConfig("events"))
  val commands = new TemplateGroupSettings(config.getConfig("commands"))
  val queries = new TemplateGroupSettings(config.getConfig("queries"))
}
