package svclang.runtime.model

import svclang.SvcLangSpec

class MessageRefSpec extends SvcLangSpec{
  describe("fullName"){
    it("should include the namespace if provided"){
      val mr = new MessageRef("sam",Some("i.am"))
      mr.fullName should equal ("i.am.sam")
    }
    it("should exclude the namespace if not provided"){
      var mr = new MessageRef("sam",None)
      mr.fullName should equal ("sam")
    }
  }
}
