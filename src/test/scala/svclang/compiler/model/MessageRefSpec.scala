package svclang.compiler.model

import svclang.SvcLangSpec

class MessageRefSpec extends SvcLangSpec{
  describe("MessageRef"){
    describe("namespace"){
      it("should be empty if not provided and there is no parent"){
        val ref = new MessageRef("data",None,None)
        ref.namespace should be (None)
      }
      it("should match what is provided"){
        val ref = new MessageRef("message",Some("hi"),None)
        ref.namespace.get should equal ("hi")
      }
      it("should take its value from the parent if not provided"){
        val p = new ServiceNode("hi") with HasMessages {}
        val ref = new MessageRef("message",None,Some(p))
        ref.namespace.get should equal ("hi")
      }
      it("should take the specific value even if a parent is provided"){
        val p = new ServiceNode("hi") with HasMessages {}
        val ref = new MessageRef("message",Some("namespace"),Some(p))
        ref.namespace.get should equal ("namespace")
      }
    }
  }
}
