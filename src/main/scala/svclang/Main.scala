package svclang

import svclang.generator.Generate

import scala.util.{Failure, Success}

object Main extends App{
  implicit val context:Context = new Context()
  val result = Generate.messages
  result match {
    case Success(paths) =>
      paths.foreach{
        case Success(path) => println(s"Generated $path")
        case Failure(msg) => println(msg)
      }
    case Failure(error) => println(error.toString)
  }
}
