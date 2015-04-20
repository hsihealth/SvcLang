package svclang.runtime.model

import svclang.SvcLangSpec
import svclang.compiler.Compile

class FieldScopeSpec extends SvcLangSpec {
  describe("fieldScope"){
    it("is none if there is no parent field scope"){
      val svc = Compile.service("service A document B { field string}").get
      svc.messages("B").fieldScope should be (None)
    }
    it("refers to a parent scope if there is one"){
      val svc = Compile.service("service A document B { required: field string }").get
      svc.messages("B").sections(0).fieldScope.get should be (svc.messages("B"))
    }
  }
  describe("message"){
    it("refers to itself if the scope is a message"){
      val svc = Compile.service("service A document B { field string}").get
      svc.messages("B").message.get should be (svc.messages("B"))
    }
    it("refers to its parent if the scope is a section"){
      val svc = Compile.service("service A document B { required: field string}").get
      svc.messages("B").sections(0).message.get should be (svc.messages("B"))
    }
  }
}
