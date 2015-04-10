package svclang.runtime.model

trait Named {
  val name:String
}

trait Documented extends Named{
  val documentation:Option[String]
}

trait SettingsScope extends Named{
  val settings:Map[String,String]
}

trait TypeAliasScope extends Named {
  val typeAliases:Map[String,TypeAlias]
}

trait MessageScope extends Named{
  val messages:Map[String,MessageDef]
}

trait StreamScope extends Named{
  val inputStreams:Map[String,StreamDef]
  val outputStreams:Map[String,StreamDef]
}

trait TypeDef extends Named

trait MessageContext extends Documented with TypeAliasScope with MessageScope
trait StreamContext extends Documented with MessageScope

trait MessageDef extends Named with Documented with TypeAliasScope {
  val sections:Seq[MessageSection]
  val `extends`:Seq[MessageRef]
  val fields:Map[String,FieldDef]
}

trait StreamDef extends Named with Documented {
  val messages:Seq[MessageSelector]
}


case class Service( name:String,
                    documentation:Option[String],
                    settings:Map[String,String],
                    typeAliases:Map[String,TypeAlias],
                    messages:Map[String,MessageDef],
                    inputStreams:Seq[InputStream],
                    outputStreams:Seq[OutputStream],
                    sections:Seq[ServiceSection]) extends MessageContext with StreamContext

case class ServiceSection( name:String,
                           documentation:Option[String],
                           settings:Map[String,String],
                           typeAliases:Map[String,TypeAlias],
                           messages:Map[String,MessageDef],
                           inputStreams:Seq[InputStream],
                           outputStreams:Seq[OutputStream]) extends MessageContext with StreamContext

case class TypeAlias( name:String,
                      documentation:Option[String],
                      baseType:TypeDef) extends Documented

case class PrimitiveType( name:String, genericType:Option[TypeDef]) extends TypeDef
case class Enumeration( name:String, values:Seq[String]) extends TypeDef
case class Union( name:String, types:Seq[TypeDef]) extends TypeDef
case class MessageRef( name:String, namespace:Option[String]) extends TypeDef

case class InputStream( name:String, documentation:Option[String], messages:Seq[MessageSelector]) extends StreamDef
case class OutputStream( name:String, documentation:Option[String], messages:Seq[MessageSelector]) extends StreamDef

case class MessageSelector( pattern:String ) extends Named { val name = pattern }

case class FieldDef( name:String,
                     documentation:Option[String],
                     defaultValue:Option[String],
                     `type`:TypeDef) extends Documented

case class MessageSection( name:String,
                           documentation:Option[String],
                           typeAliases:Map[String,TypeAlias],
                           fields:Map[String,FieldDef]) extends Documented with TypeAliasScope


case class PartialMessage( name:String,
                           documentation:Option[String],
                           sections:Seq[MessageSection],
                           `extends`:Seq[MessageRef],
                           typeAliases:Map[String,TypeAlias],
                           fields:Map[String,FieldDef]) extends MessageDef

case class Document( name:String,
                     documentation:Option[String],
                     sections:Seq[MessageSection],
                     `extends`:Seq[MessageRef],
                     typeAliases:Map[String,TypeAlias],
                     fields:Map[String,FieldDef]) extends MessageDef

case class Event( name:String,
                  documentation:Option[String],
                  sections:Seq[MessageSection],
                  `extends`:Seq[MessageRef],
                  typeAliases:Map[String,TypeAlias],
                  fields:Map[String,FieldDef]) extends MessageDef

case class Query( name:String,
                  documentation:Option[String],
                  sections:Seq[MessageSection],
                  `extends`:Seq[MessageRef],
                  typeAliases:Map[String,TypeAlias],
                  fields:Map[String,FieldDef],
                  respondsWith:MessageRef) extends MessageDef

case class Command( name:String,
                    documentation:Option[String],
                    sections:Seq[MessageSection],
                    `extends`:Seq[MessageRef],
                    typeAliases:Map[String,TypeAlias],
                    fields:Map[String,FieldDef],
                    emits:Seq[MessageRef],
                    failsWith:Seq[MessageRef]
                    )  extends MessageDef

