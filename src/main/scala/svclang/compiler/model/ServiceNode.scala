package svclang.compiler.model

import svclang.Util._

abstract class ServiceNode(val name:String, val parent:Option[ServiceNode] = None) {
  def namespace : Option[String] = parent.map(p=>snakify(p.fullName))
  lazy val fullName : String = List(namespace.getOrElse(""),normalizedName).filter(!_.isEmpty).mkString(".")
  lazy val normalizedName : String = name.replace(" ","")
  lazy val service : Option[Service] = parent match {
    case Some(svc) if svc.isInstanceOf[Service] => Some(svc.asInstanceOf[Service])
    case Some(node) => node.service
    case None if this.isInstanceOf[Service] => Some(this.asInstanceOf[Service])
    case _ => None
  }
}

trait HasDocumentation extends ServiceNode{
  private var _documentation: Option[String] = None
  def documentation = _documentation
  def withDocumentation(doc:Option[String]):ServiceNode = { _documentation = doc; this }
}

trait HasSettings extends ServiceNode{
  private var _settings: Map[String,String] = Map()
  def settings = _settings
  def withSetting(setting:(String,String)) : ServiceNode =  {_settings = _settings + setting; this}
  override lazy val namespace : Option[String] = settings.get("namespace").orElse(super.namespace).map(_.trim)
}

trait HasTypeAliases extends ServiceNode {
  private var _aliases: Map[String,TypeAlias] = Map()
  def aliases = _aliases
  def withAlias(alias:TypeAlias) : ServiceNode = { _aliases = _aliases + (alias.name -> alias); this }
}

trait HasTypeSpec extends ServiceNode {
  private var _typeSpec:Option[TypeSpec] = None
  def typeSpec = _typeSpec
  def withTypeSpec(spec:Option[TypeSpec]):ServiceNode = { _typeSpec = spec; this }
}

trait HasTypeSpecList extends ServiceNode {
  private var _typeSpecs : Vector[TypeSpec] = Vector()
  def typeSpecs = _typeSpecs
  def withTypeSpec(spec:TypeSpec) : ServiceNode = { _typeSpecs = _typeSpecs :+ spec; this }
}

trait HasIdentifierList extends ServiceNode{
  private var _ids : Vector[String] = Vector()
  def ids = _ids
  def withIdentifier(id:String):ServiceNode = { _ids = _ids :+ id; this}
}

trait HasMessages extends ServiceNode {
  private var _messages : Map[String,Message] = Map()
  def messages = _messages
  
  def withMessage(message:Message):ServiceNode = {
    val t = (message.name, message)
    _messages = _messages + t
    this
  }
  def namespacedMessages: Map[String,Message] = messages.map{tpl => tpl._2.fullName -> tpl._2 }
}

trait HasDefaultValue extends ServiceNode {
  private var _defaultValue:Option[String] = None
  def defaultValue = _defaultValue
  def withDefaultValue(default:Option[String]):ServiceNode = {_defaultValue = default; this}
}

trait HasStreams extends ServiceNode {
  private var _streams : Map[String,StreamSpec] = Map()
  def streams = _streams
  
  def withStream (stream:StreamSpec) : ServiceNode = {
    val t = (stream.name,stream)
    _streams = _streams + t
    this
  }
}

trait HasMessageSelections extends ServiceNode {
  private var _messageSelections : Vector[MessageSelection] = Vector()
  def messageSelections = _messageSelections
  def withMessageSelection (selection:MessageSelection) : ServiceNode = {
    _messageSelections = _messageSelections :+ selection
    this
  }
}

trait HasMessageExtensions extends ServiceNode{
  this: MessageBase =>
  private var _extensions : Vector[MessageRef] = Vector()
  def extensions = _extensions
  def withMessageExtension(extension:MessageRef):MessageBase = {_extensions = _extensions :+ extension; this }
}

trait HasFieldSpecs extends ServiceNode {
  this:MessageBase =>
  private var _fields : Map[String,FieldSpec] = Map()
  def fields = _fields
  
  def withField(spec:FieldSpec) : MessageBase = {
    val tpl = (spec.name,spec)
    _fields = _fields + tpl
    this
  }
}


