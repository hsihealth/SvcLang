package svclang.runtime.model

import svclang.SvcLangSpec
import svclang.compiler.Compile

class MessageScopeSpec extends SvcLangSpec{
  val svcSource =
    """
      service A
      document M1
      ## S1
      document M1
      document S1M1
      document S1M2
      ## S2
      document S2M1
      document S2M2
    """.stripMargin

  val svc = Compile.service(svcSource).get
  val s1 =  svc.sections.head
  val s2 =  svc.sections.last

  describe("findMessage"){

    it("should produce a message from itself by name only"){
      val result = s2.findMessage(new MessageRef("S2M2",None))
      result.isRight shouldBe true
      result.right.get.name should be ("S2M2")
    }

    it("should produce a message from the parent by name only"){
      val result = s2.findMessage(new MessageRef("M1",None))
      result.isRight shouldBe true
      result.right.get.name should be ("M1")
      result.right.get.messageScope.get should be (svc)
    }

    it("should produce a message from a sibling if specified by namespace"){
      val result = s2.findMessage(new MessageRef("M1",Some("A.S1")))
      result.isRight shouldBe true
      result.right.get.name should be ("M1")
      result.right.get.messageScope.get should be (s1)
    }

    it("should produce a message from a sibling by name only if no match in self or parent"){
      val result = s2.findMessage(new MessageRef("S1M1",None))
      result.isRight shouldBe true
      result.right.get.name should be ("S1M1")
      result.right.get.messageScope.get should be (s1)
    }

    it("should produce a message with a partially matching namespace"){
      val result = s2.findMessage(new MessageRef("M1",Some("S1")))
      result.isRight shouldBe true
      result.right.get.name should be ("M1")
      result.right.get.messageScope.get should be (s1)
    }

    it("should match the root by namespace"){
      val result = s2.findMessage(new MessageRef("M1",Some("A")))
      result.isRight shouldBe true
      result.right.get.messageScope.get should be (svc)
    }

    it("should not produce a message with a bogus namespace"){
      val result = s2.findMessage(new MessageRef("M1",Some("A.B")))
      result.isLeft shouldBe true
    }

    it("should not produce a message with a bogus name"){
      val result = s2.findMessage(new MessageRef("M0",None))
      result.isLeft shouldBe true
    }

    it("should return the ref when a message is not found"){
      val result = s2.findMessage(new MessageRef("M0",Some("A.S1")))
      result.isLeft shouldBe true
      result.left.get.fullName should be ("A.S1.M0")
    }
  }

}
