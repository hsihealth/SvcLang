package svclang.model.nodes


abstract class ServiceNode(val name:String, val parent:Option[ServiceNode] = None) {
  def namespace : String = parent.map{_.fullName}.getOrElse("")
  lazy val fullName : String = List(namespace,normalizedName).filter(!_.isEmpty).mkString(".")
  lazy val normalizedName : String = name.replace(" ","")
  lazy val service : Option[Service] = parent match {
    case Some(svc) if svc.isInstanceOf[Service] => Some(svc.asInstanceOf[Service])
    case Some(node) => node.service
    case None if this.isInstanceOf[Service] => Some(this.asInstanceOf[Service])
    case _ => None
  }
}

trait HasDocumentation extends ServiceNode{
  var documentation: Option[String] = None
}

trait HasSettings extends ServiceNode{
  var settings: Map[String,String] = Map()
  def +=(setting:(String,String)) : Unit = { settings = settings + setting}
  override lazy val namespace = settings.getOrElse("namespace",super.namespace).trim
}

trait HasTypeAliases extends ServiceNode {
  var aliases: Vector[TypeAlias] = Vector()
  def +=(alias:TypeAlias) : Unit = { aliases = aliases :+ alias }
}

trait HasTypeSpec extends ServiceNode {
  var typeSpec:Option[TypeSpec] = None
}

trait HasTypeSpecList extends ServiceNode {
  var typeSpecs : Vector[TypeSpec] = Vector()
  def +=(spec:TypeSpec) : Unit = { typeSpecs = typeSpecs :+ spec }
}

trait HasIdentifierList extends ServiceNode{
  var ids : Vector[String] = Vector()
  def +=(id:String):Unit = { ids = ids :+ id}
}

trait HasMessages extends ServiceNode {
  var messages : Map[String,Message] = Map()
  def +=(message:Message):Unit = {
    val t = (message.name, message)
    messages = messages + t
  }
  def namespacedMessages: Map[String,Message] = messages.map{tpl => tpl._2.fullName -> tpl._2 }
}

trait HasDefaultValue extends ServiceNode {
  var defaultValue:Option[String] = None
}

trait HasStreams extends ServiceNode {
  var streams : Map[String,StreamSpec] = Map()
  def += (stream:StreamSpec) : StreamSpec = {
    val t = (stream.name,stream)
    streams = streams + t
    stream
  }
}

trait HasMessageSelections extends ServiceNode {
  var messageSelections : Vector[MessageSelection] = Vector()
  def += (selection:MessageSelection) : MessageSelection = {
    messageSelections = messageSelections :+ selection
    selection
  }
}

trait HasMessageExtensions {
  this : MessageBase =>
  var extensions : Vector[MessageRef] = Vector()
  def +=(extension:MessageRef):Unit = extensions = extensions :+ extension
}

trait HasFieldSpecs {
  this : MessageBase =>
  var fields : Map[String,FieldSpec] = Map()
  def +=(spec:FieldSpec) : Unit = {
    val tpl = (spec.name,spec)
    fields = fields + tpl
  }
}


