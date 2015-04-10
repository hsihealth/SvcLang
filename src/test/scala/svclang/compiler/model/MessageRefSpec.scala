package svclang.compiler.model

import svclang.SvcLangSpec

class MessageRefSpec extends SvcLangSpec{
  describe("MessageRef"){
    describe("namespace"){
      it("should be empty if not provided and there is no parent"){
        val ref = new MessageRef("data",None,None)
        ref.namespace should be ("")
      }
      it("should match what is provided"){
        val ref = new MessageRef("message",Some("hi"),None)
        ref.namespace should equal ("hi")
      }
      it("should take its value from the parent if not provided"){
        val p = new ServiceNode("hi") with HasMessages {}
        val ref = new MessageRef("message",None,Some(p))
        ref.namespace should equal ("hi")
      }
      it("should take the specific value even if a parent is provided"){
        val p = new ServiceNode("hi") with HasMessages {}
        val ref = new MessageRef("message",Some("namespace"),Some(p))
        ref.namespace should equal ("namespace")
      }
    }
    describe("matches"){
      it("should match a message by name if no namespace is provided"){
        val parent = new ServiceNode("parent") with HasMessages{}
        val msg = new Message("message",Some(parent)){}
        val ref = new MessageRef("message",None,None)
        ref.matches(msg) should be (true)
      }
      it("should not match by name if a namespace is provided"){
        val parent = new ServiceNode("parent") with HasMessages{}
        val msg = new Message("message",Some(parent)){}
        val ref = new MessageRef("message",Some("oh.bother"),None)
        ref.matches(msg) should be (false)
      }
      it("should match a full name regardless of case when a namespace is provided"){
        val parent = new ServiceNode("parent") with HasMessages{}
        val msg = new Message("message",Some(parent)){}
        val ref = new MessageRef("Message",Some("parent"),None)
        ref.matches(msg) should be (true)
      }
    }
  }
}
