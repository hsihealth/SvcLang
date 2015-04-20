package svclang.runtime.model

case class OutputStream(name:String,
                        namespace:Option[String],
                        documentation:Option[String],
                        messages:Seq[MessageSelector])(context: => StreamContext) extends StreamDef {
  override type Parent = StreamContext
  def parent = Some(context)
}
