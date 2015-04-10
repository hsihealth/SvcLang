package svclang.compiler.listeners

import org.antlr.v4.runtime.tree._
import svclang.compiler.model.{Service, ServiceNode}
import svclang.parser.SvcLangBaseListener

import scala.collection.mutable

class SvcLangListener(val parser:svclang.parser.SvcLangParser,service:Option[Service] = None) extends SvcLangBaseListener
                                                                                                 with ServiceListener
                                                                                                 with DocumentationExtractor
                                                                                                 with SettingsExtractor
                                                                                                 with IdentifierListExtractor
                                                                                                 with DefaultValueExtractor
                                                                                                 with MessageRefListExtractor
                                                                                                 with MessageListener
                                                                                                 with TypeAliasListener
                                                                                                 with TypeSpecListener
                                                                                                 with FieldSpecListener
                                                                                                 with StreamListener
                                                                                                 with MessageSelectionListener
{
  implicit def TerminalNodeToString(in:TerminalNode) : String = in.getText.trim()

  protected val stack = mutable.Stack[ServiceNode]()
  //If a service is provided, put it into scope
  service.foreach(beginService)

}

