package svclang

import svclang.compiler.Compiler
import svclang.model.nodes._

class MessageCompilerSpec extends SvcLangSpec {
  describe("compiling a message"){
    it("should extract documentation"){
      val msg = Compiler.compileMessages("partial message A #hi there").get.values.head
      msg.documentation.get should equal ("hi there")
    }
    it("should extract doc on next line"){
      val msg = Compiler.compileMessages("partial message A\n#hi there").get.values.head
      msg.documentation.get should equal ("hi there")
    }
    it("should extract block docs"){
      val msg = Compiler.compileMessages("partial message A\n--\nhi there\n--").get.values.head
      msg.documentation.get should equal ("hi there")
    }
    it("should collect extensions"){
      val msg = Compiler.compileMessages("partial message A extends B").get.values.head
      msg.extensions.length should equal (1)
      msg.extensions(0).name should equal ("B")
    }
    it("should collect multiple extensions"){
      val msg = Compiler.compileMessages("partial message A extends B extends C").get.values.head
      msg.extensions.length should be (2)
      msg.extensions(0).name should equal ("B")
      msg.extensions(1).name should equal ("C")
    }
    it("should collect extensions with namespaces"){
      val msg = Compiler.compileMessages("partial message A extends B extends hi.C").get.values.head
      msg.extensions.length should be (2)
      msg.extensions(0).fullName should equal ("B")
      msg.extensions(1).fullName should equal ("hi.C")
    }
    it("should extract a type alias"){
      val msg = Compiler.compileMessages("partial message A{\ndollars -> number}").get.values.head
      msg.aliases.length should be(1)
      msg.aliases(0).name should be ("dollars")
      msg.aliases(0).typeSpec.get.name should be ("number")
    }
    it("should extract multiple type aliases"){
      val msg = Compiler.compileMessages("partial message A{\ndollars -> number\nnames -> string}").get.values.head
      msg.aliases.length should be(2)
    }
    it("should extract fields"){
      val msg = Compiler.compileMessages("partial message A{ description string}").get.values.head
      msg.fields.size should be(1)
    }
    it("should extract multiple fields"){
      val msg = Compiler.compileMessages("partial message A{\ndescription string\nage integer\n}").get.values.head
      msg.fields.size should be(2)
    }
    describe("sections"){
      it("should extract a message section"){
        val msg = Compiler.compileMessages("partial message A{\nrequired:\nsubscription string\n}").get.values.head
        msg.sections.length should be (1)
      }
      it("should extract multiple message sections"){
        val msg = Compiler.compileMessages("partial message A{\nrequired:\nsubscription string\noptional:\nage integer\n}").get.values.head
        msg.sections.length should be (2)
      }
      it("should extract message names"){
        val msg = Compiler.compileMessages("partial message A{\nrequired:\nsubscription string\n}").get.values.head
        msg.sections(0).name should equal("required")
      }
      it("should extract inline doc"){
        val msg = Compiler.compileMessages("partial message A{\nrequired:#tada\nage integer\n}").get.values.head
        msg.sections(0).documentation.get should equal ("tada")
      }
      it("should extract block doc"){
        val msg = Compiler.compileMessages("partial message A{\nrequired:\n--\ntada\n--\nage integer\n}").get.values.head
        msg.sections(0).documentation.get should equal ("tada")
      }
      it("should contain elements"){
        val msg = Compiler.compileMessages("partial message A{\nrequired:\nname integer\n}").get.values.head
        msg.sections(0).fields.size should be (1)
      }
      it("should parse a required fields section"){
        val msg = Compiler.compileMessages("partial message A{\nrequired:\n}").get.values.head
        msg.sections(0) shouldBe a [RequiredFieldsSection]
      }
    }
    describe("partial message"){
      it("should extract a partial message"){
        val msg = Compiler.compileMessages("partial message A").get.values.head
        msg shouldBe a [PartialMessage]
      }
    }
    describe("event"){
      it("should extract an event"){
        val evt = Compiler.compileMessages("event A").get.values
        evt.size shouldNot be (0)
        evt.head shouldBe a [Event]
      }
    }
    describe("document"){
      it("should extract a document"){
        val doc = Compiler.compileMessages("document A").get.values
        doc.size shouldNot be (0)
        doc.head shouldBe a [Document]
      }
    }
    describe("query"){
      it("should extract a query"){
        val qry = Compiler.compileMessages("query A responds with B").get.values
        qry.size shouldNot be (0)
        qry.head shouldBe a [Query]
      }
      it("should extract a ref to the responds with message"){
        val msgs = Compiler.compileMessages("query A responds with B").get
        msgs.size should be (1)
        val qry = msgs("A").asInstanceOf[Query]
        qry.respondsWith shouldNot be (None)
        qry.respondsWith.get shouldBe a [MessageRef]
        qry.respondsWith.get.name should be ("B")
      }
      it("should extract an inline response message and provide a ref to it"){
        val msgs = Compiler.compileMessages("query A responds with B extends hi.C").get
        msgs.size should be (2)
        val qry = msgs("A").asInstanceOf[Query]
        qry.respondsWith shouldNot be (None)
        qry.respondsWith.get shouldBe a [MessageRef]
        qry.respondsWith.get.name should be ("B")
        msgs("B") shouldBe a [Document]
        msgs("B").name should be ("B")
        msgs("B").extensions(0).fullName should be ("hi.C")
      }
    }
    describe("command"){
      it("should extract a command"){
        val cmd = Compiler.compileMessages("command A emits B fails with C").get.values
        cmd.size shouldNot be (0)
        cmd.head shouldBe a[Command]
      }
      it("should extract a ref to an emits message"){
        val msgs = Compiler.compileMessages("command A emits B").get
        msgs.size should equal (1)
        val cmd = msgs("A").asInstanceOf[Command]
        cmd.emits.length should equal (1)
        cmd.emits(0).name should equal ("B")
      }
      it("should extract an inline emits event and provide a ref to it"){
        val msgs = Compiler.compileMessages("command A emits B extends C").get
        msgs.size should be (2)
        val cmd = msgs("A").asInstanceOf[Command]
        cmd.emits.length should be (1)
        cmd.emits(0) shouldBe a [MessageRef]
        cmd.emits(0).name should be ("B")
        msgs("B") shouldBe a [Event]
        msgs("B").name should be ("B")
        msgs("B").extensions(0).name should be ("C")
      }
      it("should extract a fails with message"){
        val msgs = Compiler.compileMessages("command A fails with B").get
        msgs.size should equal (1)
        val cmd = msgs("A").asInstanceOf[Command]
        cmd.failsWith.length should equal (1)
        cmd.failsWith(0).name should equal ("B")
      }
      it("should extract an inline fails with and provide a ref to it"){
        val msgs = Compiler.compileMessages("command A fails with B extends C").get
        msgs.size should be (2)
        val cmd = msgs("A").asInstanceOf[Command]
        cmd.failsWith.length should be (1)
        cmd.failsWith(0) shouldBe a [MessageRef]
        cmd.failsWith(0).name should be ("B")
        msgs("B") shouldBe a [Event]
        msgs("B").name should be ("B")
        msgs("B").extensions(0).name should be ("C")
      }
    }

  }
}
