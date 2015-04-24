package svclang.runtime.model

import svclang.SvcLangSpec
import svclang.compiler.Compile

class ServiceSpec extends SvcLangSpec{
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
    it("should search itself before children"){
      val result = svc.findMessage(new MessageRef("M1",None))
      result.right.get.messageScope.get should be (svc)
    }
    it("should search children when namespaces don't match"){
      val result = svc.findMessage(new MessageRef("M1",Some("s1")))
      result.right.get.messageScope.get should be (s1)
    }
    it("should search children"){
      val result = svc.findMessage(new MessageRef("S2M1",None))
      result.right.get.messageScope.get should be (s2)
    }
    it("should return the ref if no match"){
      val ref = new MessageRef("NobodyLovesMe",None)
      val result = svc.findMessage(ref)
      result.isLeft shouldBe true
      result.left.get should be (ref)
    }
  }
}
