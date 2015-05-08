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
}

