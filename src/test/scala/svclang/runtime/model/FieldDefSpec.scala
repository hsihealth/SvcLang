package svclang.runtime.model

import svclang.SvcLangSpec
import svclang.compiler.Compile

class FieldDefSpec extends SvcLangSpec {
  describe("message"){
    it("should refer to the parent when the parent is a message"){
      val svc = Compile.service("service A partial message B { field string }").get
      svc.messages("B").fieldDefinitions("field").message.get should be (svc.messages("B"))
    }
    it("should refer to the grandparent when the parent is a section"){
      val svc = Compile.service("service A partial message B { required: field string }").get
      svc.messages("B").sections(0).fieldDefinitions("field").message.get should be (svc.messages("B"))
    }
  }

  describe("Type Aliases"){
    val svcSource =
      """
        service S
        a -> integer
        ## S1
        b -> string
        partial message M {
          c -> boolean
          f1 a
          f2 b
          f3 c
          f4 d
        }
      """.stripMargin

    val svc = Compile.service(svcSource).get

    describe("typeAliasScope"){
      it("should be the parent of the field"){
        svc.sections(0).messages("M").fields("f1").typeAliasScope.get should be (svc.sections(0).messages("M"))
      }
    }

    describe("typeAlias"){
      it("should identify an alias when present"){
        svc.sections(0).messages("M").fields("f1").typeAlias shouldNot be (None)
        svc.sections(0).messages("M").fields("f2").typeAlias shouldNot be (None)
        svc.sections(0).messages("M").fields("f3").typeAlias shouldNot be (None)
        svc.sections(0).messages("M").fields("f4").typeAlias should be (None)
      }
    }

    describe("dataType"){
      it("should present the aliased type when an alias is present"){
        val m = svc.sections(0).messages("M")
        m.fields("f1").dataTypeDefinition shouldBe a [MessageRef]
        m.fields("f1").dataType should be (svc.typeAliases("a").baseType)
        m.fields("f2").dataType should be (svc.sections(0).typeAliases("b").baseType)
        m.fields("f3").dataType should be (m.typeAliases("c").baseType)
        svc.sections(0).messages
      }
      it("should present the original definition if not aliased"){
        val m = svc.sections(0).messages("M")
        m.fields("f4").dataType should be (m.fields("f4").dataTypeDefinition)
      }
    }
  }

}
