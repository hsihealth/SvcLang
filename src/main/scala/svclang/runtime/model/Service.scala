package svclang.runtime.model

case class Service( name:String,
                    namespace:Option[String],
                    documentation:Option[String],
                    settings:Map[String,String],
                    typeAliases:Map[String,TypeAlias],
                    messages:Map[String,MessageDef],
                    inputStreams:Seq[InputStream],
                    outputStreams:Seq[OutputStream],
                    sections:Seq[ServiceSection]) extends MessageContext with StreamContext {
  def parent = None

  def allMessages:Iterable[MessageDef] = messages.values ++ sections.flatMap(_.messages.values)

  //having no scope, the service will check its own messages then look everywhere else
  override def findMessage(ref:MessageRef):Either[MessageRef,MessageDef] = {
    allMessages.find(_.matches(ref)) match {
      case None => Left(ref)
      case Some(msg) => Right(msg)
    }
  }
}
