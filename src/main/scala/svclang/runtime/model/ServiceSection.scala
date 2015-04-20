package svclang.runtime.model

case class ServiceSection( name:String,
                           namespace:Option[String],
                           documentation:Option[String],
                           settings:Map[String,String],
                           typeAliases:Map[String,TypeAlias],
                           messages:Map[String,MessageDef],
                           inputStreams:Seq[InputStream],
                           outputStreams:Seq[OutputStream])(service: => Service) extends MessageContext with StreamContext {

  override type Parent  = Service
  def parent = Some(service)
}
