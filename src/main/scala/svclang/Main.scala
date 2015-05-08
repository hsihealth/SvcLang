package svclang

import svclang.generator.{ScalaServiceRenderer, ServiceRenderer, Generate}

import scala.util.{Failure, Success}

object Main extends App{

  processArgs()

  implicit val context:Context = new Context()
  implicit val renderer:ServiceRenderer = ScalaServiceRenderer
  
  val result = Generate.messages
  result match {
    case Success(paths) =>
      paths.foreach{
        case Success(path) => println(s"Generated $path")
        case Failure(msg) => println(msg)
      }
    case Failure(error) => println(error.toString)
  }

  //can replace this someday with Argot or another command line option parser
  private def processArgs() = {
    if (args.length > 0) System.setProperty("svclang.sourcePath",args.head)
    if (args.length > 1) System.setProperty("svclang.generator.scala.outputDirectory",args.last)
  }
}
