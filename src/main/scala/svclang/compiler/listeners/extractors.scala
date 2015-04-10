package svclang.compiler.listeners

import svclang.compiler.model._
import svclang.parser.SvcLangParser._

import scala.collection.JavaConversions._

trait SettingsExtractor {
  this : SvcLangListener =>

  override def enterSetting(ctx: SettingContext) : Unit = {
    stack.top match {
      case hasSettings:HasSettings => hasSettings.withSetting(settingFromContext(ctx))
      case _ =>
    }
  }

  def settingFromContext(ctx:SettingContext) : (String,String) = {
    val key = ctx.Identifier().getText
    val value = ctx.Constant().getText.replaceAll("\"","")
    key -> value
  }
}

trait DocumentationExtractor {
  this : SvcLangListener =>

  override def enterDocumentation(ctx:DocumentationContext):Unit = {
    stack.top match {
      case documented:HasDocumentation => documented.withDocumentation(documentFromContext(ctx))
      case _ =>
    }
  }

  def documentFromContext(ctx:DocumentationContext) : Option[String] = {
    ctx match {
      case null => None
      case doc => Some(doc.getText.replaceAll("--|#","").trim())
    }
  }
}

trait DefaultValueExtractor {
  this: SvcLangListener =>

  override def enterDefaultValue(ctx:DefaultValueContext):Unit = {
    Option(ctx.Constant()).orElse(Option(ctx.Identifier())).foreach { terminal =>
      stack.top match {
        case hasDef: HasDefaultValue => hasDef.withDefaultValue(Some(terminal.getText.replace("\"","")))
      }
    }
  }
}

trait IdentifierListExtractor  {
  this : SvcLangListener with MessageListener =>

  override def enterIdentifierList(ctx: IdentifierListContext): Unit = {
    stack.top match {
      case idl:HasIdentifierList => ctx.Identifier().foreach(idl withIdentifier _)
      case _ =>
    }
  }
}

trait MessageRefListExtractor {
  this: SvcLangListener with MessageListener =>

  override def enterMessageRefList(ctx:MessageRefListContext):Unit = {
    stack.top match {
      case refs:HasMessageExtensions => ctx.messageRef().foreach{ ref =>
        val namespace : Option[String] = Option(ref.namespace()).map{_.getText().trim()}
        val msgName : String = ref.Identifier()
        refs withMessageExtension new MessageRef(msgName,ns = namespace, ctx = currentMessageTarget)
      }
    }
  }
}