package svclang.compiler

import org.antlr.v4.runtime.tree.TerminalNode
import svclang.model.nodes.PartialMessage
import svclang.model.nodes._
import svclang.parser.SvcLangParser._

trait MessageCompiler
{
  this : Compiler =>

  protected var messages : Map[String,Message] = Map()
  protected var currentMessage : Option[Message] = None
  protected var currentMessageSection : Option[MessageSection] = None

  protected def currentMessageTarget : Option[HasMessages] = {
    if (stack.nonEmpty){
      Option(stack.top).orElse(currentServiceSection).orElse(currentService) match {
        case Some(context) if context.isInstanceOf[HasMessages] => Some(context.asInstanceOf[HasMessages])
        case _ => None
      }
    } else None
  }

  protected def inRequiredFieldsSection : Boolean = {
    currentMessageSection.exists(_.isInstanceOf[RequiredFieldsSection])
  }
  //Message types

  //Partial Message
  override def enterPartialMessage(ctx: PartialMessageContext): Unit = {
    beginMessage( new PartialMessage(ctx.messageDef().Identifier(), currentMessageTarget) )
  }
  override def exitPartialMessage(ctx: PartialMessageContext): Unit = endMessage()

  //Event
  override def enterEvent(ctx:EventContext): Unit = {
    beginMessage( new Event(ctx.messageDef().Identifier(), currentMessageTarget))
  }
  override def exitEvent(ctx:EventContext) = endMessage()

  //Document
  override def enterDocument(ctx:DocumentContext): Unit = {
    beginMessage( new Document(ctx.messageDef().Identifier(), currentMessageTarget))
  }
  override def exitDocument(ctx:DocumentContext) = endMessage()

  //Query
  override def enterQuery(ctx:QueryContext): Unit = {
    beginMessage( new Query(ctx.messageDef().Identifier(), currentMessageTarget))
  }
  override def exitQuery(ctx:QueryContext) = endMessage()

  override def enterResponseRef(ctx:ResponseRefContext): Unit = {
    currentMessage.foreach{ msg=>
      msg.asInstanceOf[Query].respondsWith = Some(new MessageRef(ctx.messageRef().Identifier()))
    }
  }

  override def enterResponseDef(ctx:ResponseDefContext): Unit = {
    val responseDoc = new Document(ctx.messageDef().Identifier(), currentMessageTarget)
    currentMessage.foreach{ msg =>
      msg.asInstanceOf[Query].respondsWith = Some(new MessageRef(responseDoc))
    }
    beginMessage(responseDoc)
  }
  override def exitResponseDef(ctx:ResponseDefContext): Unit = {
    //ending a message defined inline should not close the current message section
    endMessage(shouldEndSection = false)
  }


  //Command
  override def enterCommand(ctx:CommandContext): Unit = {
    beginMessage( new Command(ctx.messageDef().Identifier(), currentMessageTarget))
  }
  override def exitCommand(ctx:CommandContext) = endMessage()

  override def enterEmitsRef(ctx:EmitsRefContext): Unit = {
    currentMessage.foreach{ msg =>
      msg.asInstanceOf[Command].addEmits(new MessageRef(ctx.messageRef().Identifier()))
    }
  }

  override def enterEmitsDef(ctx:EmitsDefContext): Unit = {
    val emitsEvent = new Event(ctx.messageDef().Identifier().getText.trim(), currentMessageTarget)
    currentMessage.foreach{msg =>
      msg.asInstanceOf[Command].addEmits(new MessageRef(emitsEvent))
    }
    beginMessage(emitsEvent)
  }
  override def exitEmitsDef(ctx:EmitsDefContext): Unit ={
    endMessage(shouldEndSection = false)
  }

  override def enterFailsWithRef(ctx:FailsWithRefContext):Unit = {
    currentMessage.foreach{msg =>
      msg.asInstanceOf[Command].addFailsWith(new MessageRef(ctx.messageRef().Identifier()))
    }
  }

  override def enterFailsWithDef(ctx:FailsWithDefContext):Unit = {
    val failsWithEvent = new Event(ctx.messageDef().Identifier(), currentMessageTarget)
    currentMessage.foreach{msg =>
      msg.asInstanceOf[Command].addFailsWith(new MessageRef(failsWithEvent))
    }
    beginMessage(failsWithEvent)
  }
  override def exitFailsWithDef(ctx:FailsWithDefContext):Unit = {
    endMessage(shouldEndSection = false)
  }


  //Sections
  override def enterMessageSection(ctx:MessageSectionContext): Unit = {
    beginSection(new MessageSection(ctx.Identifier().getText.replace(":","").trim(), currentMessageTarget))
  }

  override def enterRequiredFieldsSection(ctx:RequiredFieldsSectionContext) : Unit = {
    beginSection(new RequiredFieldsSection(currentMessageTarget))
  }

  private def beginMessage(message:Message) : Unit = {
    currentMessageTarget.foreach{msgs => msgs += message}
    currentMessage = Some(message)
    stack.push(message)
  }

  private def endMessage(shouldEndSection:Boolean = true) = {
    if (shouldEndSection)
      currentMessageSection.foreach(endSection) //close any open sections
    registerMessage(stack.pop().asInstanceOf[Message])
    currentMessage = None
  }

  private def beginSection(section:MessageSection) = {
    currentMessage.foreach{ msg =>
      msg += section
      currentMessageSection.foreach(endSection)
      currentMessageSection = Some(section)
      stack.push(section)
    }
  }

  private def endSection(section:MessageSection) = {
    if (stack.top.isInstanceOf[MessageSection]){
      currentMessageSection = None
      stack.pop()
    }
  }

  private def registerMessage(message:Message) : Unit = {
    val tpl = (message.fullName, message)
    messages = messages + tpl
  }

}
