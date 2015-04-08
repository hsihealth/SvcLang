package svclang.model.nodes

import svclang.SvcLangSpec
import svclang.compiler.Compiler



class ServiceSpec extends SvcLangSpec {
  describe("namespacedMessages"){
    it("should collect messages by namespace"){
      val svc = Compiler.compileService("service A document B event C").get
      svc.namespacedMessages.keys should be (Set("A.B","A.C"))
    }
    it("should include nested message defs"){
      val svc = Compiler.compileService("service A document B ## Section C\nevent D").get
      svc.namespacedMessages.keys should be (Set("A.B","A.SectionC.D"))
    }
  }
  describe("getMessage"){
    it("should find a message by exact reference"){
      val svc = Compiler.compileService("service A document B ## Section C\nevent D").get
      svc.getMessage(new MessageRef("A.B",None,None)).get shouldBe a [Document]
      svc.getMessage(new MessageRef("A.SectionC.D",None,None)).get shouldBe a [Event]
    }
    it("should find a message by name with no namespace in the ref"){
      val svc = Compiler.compileService("service A document B ## Section C\nevent D").get
      svc.getMessage(new MessageRef("B",None,None)).get shouldBe a [Document]
      svc.getMessage(new MessageRef("D",None,None)).get shouldBe a [Event]
    }
    it("should find a message regardless of case when a namespace is provided"){
      val svc = Compiler.compileService("service A document B ## Section C\nevent D").get
      svc.getMessage(new MessageRef("b",Some("a"),None)).get shouldBe a [Document]
      svc.getMessage(new MessageRef("d",Some("a.sectionc"),None)).get shouldBe a [Event]
    }
    it("should be none when no match is found"){
      val svc = Compiler.compileService("service A document B ## Section C\nevent D").get
      svc.getMessage(new MessageRef("r",None,None)) should be (None)
    }
    it("should be none if the name matches but the namespace does not"){
      val svc = Compiler.compileService("service A document B ## Section C\nevent D").get
      svc.getMessage(new MessageRef("B",Some("z"),None)) should be (None)
    }
  }
}
