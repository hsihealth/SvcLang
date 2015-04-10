package svclang.compiler.listeners

import org.antlr.v4.runtime.{BaseErrorListener, RecognitionException, Recognizer}

/**
 * Created by nathanstults on 4/1/15.
 */
class CompilerErrorListener(silent:Boolean = false) extends BaseErrorListener {
  val errors : StringBuffer = new StringBuffer()

  override def syntaxError(recognizer: Recognizer[_, _], offendingSymbol: scala.Any, line: Int, charPositionInLine: Int, msg: String, e: RecognitionException): Unit = {
    val message = s"line $line:$charPositionInLine at $offendingSymbol: $msg"
    errors.append(message).append("\n")
    if (!silent) System.err.println(message)
  }

  def hasErrors = errors.length() > 0
  def message = errors.toString()

}
