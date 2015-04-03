package svclang.model.nodes


abstract class ServiceNode(val name:String) {
}

trait HasDocumentation {
  this : ServiceNode =>
  var documentation: Option[String] = None
}

trait HasSettings {
  this: ServiceNode => 
  var settings: Map[String,String] = Map()
  def +=(setting:(String,String)) : Unit = { settings = settings + setting}
}

trait HasTypeAliases {
  this: ServiceNode =>
  var aliases: Vector[TypeAlias] = Vector()
  def +=(alias:TypeAlias) : Unit = { aliases = aliases :+ alias }
}

trait HasTypeSpec {
  this: ServiceNode =>
  var typeSpec:Option[TypeSpec] = None
}

trait HasTypeSpecList {
  this: ServiceNode =>
  var typeSpecs : Vector[TypeSpec] = Vector()
  def +=(spec:TypeSpec) : Unit = { typeSpecs = typeSpecs :+ spec }
}

trait HasIdentifierList {
  this: ServiceNode =>
  var ids : Vector[String] = Vector()
  def +=(id:String):Unit = { ids = ids :+ id}
}

trait HasMessages {
  this: ServiceNode =>
  var messages : Map[String,Message] = Map()
  def +=(message:Message):Unit = {
    val t = (message.name, message)
    messages = messages + t
  }
}

trait HasMessageExtensions {
  this: MessageBase =>
  var extensions : Vector[MessageRef] = Vector()
  def +=(extension:MessageRef):Unit = extensions = extensions :+ extension
}

trait HasFieldSpecs {
  this:MessageBase =>
  var fields : Map[String,FieldSpec] = Map()
  def +=(spec:FieldSpec) : Unit = {
    val tpl = (spec.name,spec)
    fields = fields + tpl
  }
}

trait HasDefaultValue {
  this:ServiceNode =>
  var defaultValue:Option[String] = None
}
