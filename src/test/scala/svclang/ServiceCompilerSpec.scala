package svclang

import svclang.model.nodes.{PartialMessage, Service}
import svclang.compiler.Compiler

/**
 * Created by nathanstults on 4/1/15.
 */
class ServiceCompilerSpec  extends SvcLangSpec{
  describe("compiling a service"){
    it("should produce a service class"){
      Compiler.compileService("service Hi").get shouldBe a [Service]
    }
    describe ("documentation extraction"){
      it("should extract inline documentation"){
        val svc = Compiler.compileService("service MyService #with inline docs").get
        svc.documentation.get should be ("with inline docs")
      }
      it("should extract block documentation"){
        val svc = Compiler.compileService("service MyService\n--\nwith block docs\n--").get
        svc.documentation.get should be ("with block docs")
      }
    }

    describe ("setting extraction") {
      it("should extract a setting"){
        val svc = Compiler.compileService("service MyService version 1.0").get
        svc.settings should contain ("version"->"1.0")
      }

      it("should extract multiple settings"){
        val svc = Compiler.compileService("service MyService version 1.0 another 20").get
        svc.settings should contain ("version" -> "1.0")
        svc.settings should contain ("another" -> "20")
      }
    }

    describe ("sections"){
      it("should extract a section"){
        val svc = Compiler.compileService("service MyService\n## Here Is a Section (of love)").get
        svc.sections.length should equal (1)
      }
      it("should give the section an appropriate name"){
        val svc = Compiler.compileService("service MyhService\n##  Section A").get
        svc.sections(0).name should equal ("Section A")
      }
      it("should extract multiple sections"){
        val svc = Compiler.compileService("service MyService\n## Section A\n## Section B").get
        svc.sections.length should equal(2)
      }
      it("should add documentation to a section"){
        val svc = Compiler.compileService("service MyService\n##Section A\n# hi friend!").get
        svc.sections(0).documentation.get should equal ("hi friend!")
      }
    }

    describe("message"){
      it("can be compiled"){
        val svc = Compiler.compileService("service A\npartial message B").get
        svc.messages.size should be(1)
        svc.messages("B") shouldBe a[PartialMessage]
      }
    }

  }
}
