package svclang.compiler.listeners

import svclang.compiler.model.{HasStreams, InputStream, OutputStream, StreamSpec}
import svclang.parser.SvcLangParser._

trait StreamListener {
  this : SvcLangListener =>

  protected var streams : Map[String,StreamSpec] = Map()
  private def registerStream(stream:StreamSpec) : Unit = {
    val tpl = (stream.name, stream)
    streams = streams + tpl
  }
  protected def currentStreamTarget : Option[HasStreams] = {
    if (stack.nonEmpty){
      Option(stack.top).orElse(currentServiceSection).orElse(currentService) match {
        case Some(context) if context.isInstanceOf[HasStreams] => Some(context.asInstanceOf[HasStreams])
        case _ => None
      }
    } else None
  }

  override def enterInputStreamDef(ctx:InputStreamDefContext) : Unit = {
    val stream = new InputStream(ctx.Identifier(),currentStreamTarget)
    beginStream(stream)
  }
  override def exitInputStreamDef(ctx:InputStreamDefContext) : Unit = endStream()

  override def enterOutputStreamDef(ctx:OutputStreamDefContext) : Unit = {
    val stream = new OutputStream(ctx.Identifier(),currentStreamTarget)
    beginStream(stream)
  }
  override def exitOutputStreamDef(ctx:OutputStreamDefContext) : Unit = endStream()

  private def beginStream(stream:StreamSpec) : Unit = {
    currentStreamTarget.foreach{streams => streams withStream stream}
    stack.push(stream)
  }

  private def endStream() = {
    registerStream(stack.pop().asInstanceOf[StreamSpec])
  }

}
