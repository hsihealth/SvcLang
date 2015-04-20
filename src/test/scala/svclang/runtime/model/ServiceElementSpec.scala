package svclang.runtime.model

import svclang.SvcLangSpec
import svclang.compiler.Compile

class ServiceElementSpec extends SvcLangSpec {
  describe("messageScope"){
    it("returns the parent when the parent is a message scope"){
      val el = Compile.service("service A document B").get.messages("B")
      el.messageScope shouldNot be (None)
      el.messageScope.get should be (el.parent.get)
      el.messageScope.get shouldBe a [Service]
    }
  }
}
