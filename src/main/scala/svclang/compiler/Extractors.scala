package svclang.compiler

import svclang.model.nodes._
import svclang.parser.SvcLangParser._
import scala.collection.JavaConversions._

trait SettingsExtractor {
  this : Compiler =>

  override def enterSetting(ctx: SettingContext) : Unit = {
    stack.top match {
      case withSettings:HasSettings => withSettings.settings += settingFromContext(ctx)
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
  this : Compiler =>

  override def enterDocumentation(ctx:DocumentationContext):Unit = {
    stack.top match {
      case documented:HasDocumentation => documented.documentation = documentFromContext(ctx)
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
  this: Compiler =>

  override def enterDefaultValue(ctx:DefaultValueContext):Unit = {
    Option(ctx.Constant()).orElse(Option(ctx.Identifier())).foreach { terminal =>
      stack.top match {
        case hasDef: HasDefaultValue => hasDef.defaultValue = Some(terminal.getText.replace("\"",""))
      }
    }
  }
}

trait IdentifierListExtractor  {
  this : Compiler with MessageCompiler =>

  override def enterIdentifierList(ctx: IdentifierListContext): Unit = {
    stack.top match {
      case idl:HasIdentifierList => ctx.Identifier().foreach(idl += _)
      case _ =>
    }
  }
}

trait MessageRefListExtractor {
  this: Compiler with MessageCompiler =>

  override def enterMessageRefList(ctx:MessageRefListContext):Unit = {
    stack.top match {
      case refs:HasMessageExtensions => ctx.messageRef().foreach{ ref =>
        val namespace : Option[String] = Option(ref.namespace()).map{_.getText().trim()}
        val msgName : String = ref.Identifier()
        refs += new MessageRef(msgName,ns = namespace, ctx = currentMessageTarget)
      }
    }
  }
}