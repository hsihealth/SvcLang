package svclang

import com.typesafe.config.{ConfigFactory, Config}

class Context(config:Config = ConfigFactory.load()) {
  val settings = new Settings(config)
}
