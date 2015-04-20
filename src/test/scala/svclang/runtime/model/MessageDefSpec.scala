package svclang.runtime.model

import svclang.SvcLangSpec
import svclang.compiler.Compile


class MessageDefSpec extends SvcLangSpec {
  def TestMessage(name:String,namespace:Option[String]) : MessageDef = new PartialMessage(name,namespace,None,Seq(),Seq(),Map(),Map())(null)

  describe("matches"){
    it("should match when both name and namespace match"){
      val msgDef = TestMessage("hi",Some("hee.haw"))
      val msgRef = new MessageRef("hi",Some("hee.haw"))
      msgDef.matches(msgRef) shouldBe (true)
    }
    it("should match when the names match and no ns is in the ref"){
      val msgDef = TestMessage("hi",Some("hee.haw"))
      val msgRef = new MessageRef("hi",None)
      msgDef.matches(msgRef) should be (true)
    }
    it("should not match when the message has no ns and the ref does"){
      val msgDef = TestMessage("hi",None)
      val msgRef = new MessageRef("hi",Some("hee.haw"))
      msgDef.matches(msgRef) shouldNot be (true)
    }
    it("should not match when then namespaces dont match"){
      val msgDef = TestMessage("hi",Some("hee.haw"))
      val msgRef = new MessageRef("hi",Some("haw.hee"))
      msgDef.matches(msgRef) shouldNot be (true)
    }
    it("should not match if the names don't match"){
      val msgDef = TestMessage("hi",Some("a.b"))
      val msgRef = new MessageRef("ho",Some("a.b"))
      msgDef.matches(msgRef) shouldNot be (true)
    }
  }
  describe("extendedMessages"){
    val svcSource =
      """
        service A
        partial message M1
        partial message M2
        document M3 extends M1 extends M2
        ## S1
        document M4 extends Silly.M1
        ## S2
        document M5 extends M3 extends S1.M4
      """.stripMargin
    val svc = Compile.service(svcSource).get
    it("should present a list of extended messages"){
      val result = svc.sections(1).messages("M5").extendedMessages
      result.size should be (2)
      result.head.isRight shouldBe true
      result.head.right.get.name should be("M3")
      result.last.isRight shouldBe true
      result.last.right.get.name should be ("M4")
    }
    it("should include refs to messages that could not be resolved"){
      val result = svc.sections(0).messages("M4").extendedMessages
      result.last.isLeft shouldBe true
      result.last.left.get.fullName should be ("Silly.M1")
    }
  }
  describe("fields"){
    val svcSource =
    """
      service S
      partial message A {
        f1 string
        required:
        f2 string
        f6 string
      }
      partial message B extends A {
        f2 integer
        f3 string
        required:
        f4 string
        f5 integer
      }
      document C extends B {
        f1 integer
        required:
        f5 string
      }
    """.stripMargin
    val svc = Compile.service(svcSource).get
    val mA = svc.messages("A")
    val mB = svc.messages("B")
    val mC = svc.messages("C")

    it("should present its own fields"){
      mA.fields.size should be (3)
      mA.fields("f1").required shouldBe false
      mA.fields("f1").dataTypeDefinition.name should be ("string")
      mA.fields("f2").required shouldBe true
      mA.fields("f2").dataTypeDefinition.name should be ("string")
      mA.fields("f6").required shouldBe true
      mA.fields("f6").dataTypeDefinition.name should be("string")
    }
    it("should present fields inherited from a parent"){
      mB.fields.size should be (6)
      mB.fields("f1") should be (mA.fields("f1"))
    }
    it("should redefine inherited fields if present"){
      mB.fields("f2") shouldNot be (mA.fields("f2"))
      mB.fields("f2").required shouldNot be (true)
      mB.fields("f2").dataTypeDefinition.name should be ("integer")
    }
    it("should combine all fields from ancestors"){
      val expected = Map(
        "f1" -> mC.fields("f1"),
        "f2" -> mB.fields("f2"),
        "f3" -> mB.fields("f3"),
        "f4" -> mB.fields("f4"),
        "f5" -> mC.fields("f5"),
        "f6" -> mA.fields("f6")
      )
      mC.fields should equal (expected)
    }
    it("should inherit root to leaf"){
      mC.fields("f1").message.get should be (mC)
      mC.fields("f2").message.get should be (mB)
      mC.fields("f3").message.get should be (mB)
      mC.fields("f4").message.get should be (mB)
      mC.fields("f5").message.get should be (mC)
      mC.fields("f6").message.get should be (mA)
    }
  }
}

