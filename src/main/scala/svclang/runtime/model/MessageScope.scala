package svclang.runtime.model

trait MessageScope extends ServiceElement {
  val messages:Map[String,MessageDef]

  def findMessage(ref:MessageRef):Either[MessageRef,MessageDef] = {
    messages.values.find(_.matches(ref)) match {
      case None => messageScope.map(_.findMessage(ref)).getOrElse(Left(ref))
      case Some(msg) => Right(msg)
    }
  }
}
