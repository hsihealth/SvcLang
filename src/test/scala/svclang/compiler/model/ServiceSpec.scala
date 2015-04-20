package svclang.compiler.model

import svclang.SvcLangSpec
import svclang.compiler.Parse


class ServiceSpec extends SvcLangSpec {
  describe("namespacedMessages"){
    it("should collect messages by namespace"){
      val svc = Parse.service("service A document B event C").get
      svc.namespacedMessages.keys should be (Set("A.B","A.C"))
    }
  }
}
