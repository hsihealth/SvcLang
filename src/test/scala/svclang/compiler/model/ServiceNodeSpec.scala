package svclang.compiler.model

import svclang.SvcLangSpec

class ServiceNodeSpec extends SvcLangSpec{
  describe("namespace"){
    it("should default to empty"){
      val n = new ServiceNode("hi",None){}
      n.namespace should equal ("")
    }
    it("should inherit from a parent"){
      val p = new ServiceNode("parent",None){}
      val n = new ServiceNode("child",Some(p)){}
      n.namespace should equal ("parent")
    }
    it("should allow an override from settings"){
      val p = new ServiceNode("parent",None){}
      val n = new ServiceNode("child",Some(p)) with HasSettings {
        this withSetting "namespace" -> "tada"
      }
      n.namespace should equal ("tada")
    }
    it("should be deeply nested"){
      val ggp = new ServiceNode("greatgrandparent",None){}
      val gp = new ServiceNode("grandparent",Some(ggp)){}
      val p = new ServiceNode("parent",Some(gp)){}
      val n = new ServiceNode("child",Some(p)){}
      n.namespace should equal ("greatgrandparent.grandparent.parent")
    }
  }
  describe("fullName"){
    it("should just be the name with no parent"){
      val n = new ServiceNode("alone",None){}
      n.fullName should equal (n.name)
    }
    it("should combine namespace and name"){
      val p = new ServiceNode("parent",None){}
      val n = new ServiceNode("child",Some(p)){}
      n.fullName should equal ("parent.child")
    }
    it("should be deeply nested"){
      val ggp = new ServiceNode("greatgrandparent",None){}
      val gp = new ServiceNode("grandparent",Some(ggp)){}
      val p = new ServiceNode("parent",Some(gp)){}
      val n = new ServiceNode("child",Some(p)){}
      n.fullName should equal ("greatgrandparent.grandparent.parent.child")
    }
  }
  describe("normalizedName"){
    it("should remove spaces"){
      val p = new ServiceNode("Duck Duck Duck Duck Duck Duck GOOSE",None) {}
      p.normalizedName should equal ("DuckDuckDuckDuckDuckDuckGOOSE")
    }
  }
  describe("service"){
    it("should return nothing if a service is not in the hierarchy"){
      val n = new ServiceNode("hi",None){}
      n.service should be (None)
    }
    it("should return itself it the node is itself a service"){
      val s = new Service("i am he")
      s.service.get shouldBe a [Service]
      s.service.get.name should equal ("i am he")
    }
    it("should return a parent if the parent is a service"){
      val s = new Service("tada")
      val n = new ServiceNode("kiddo",Some(s)){}
      n.service shouldNot be (None)
      n.service.get should be (s)
    }
    it("should return an ancestor if the ancestor is a service"){
      val s = new Service("Gruncle Stan")
      val p = new ServiceNode("parent",Some(s)){}
      val n = new ServiceNode("child",Some(p)){}
      n.service shouldNot be (None)
      n.service.get should equal (s)
    }
  }
}
