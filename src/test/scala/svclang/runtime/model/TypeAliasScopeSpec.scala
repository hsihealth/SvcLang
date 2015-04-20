package svclang.runtime.model

import svclang.SvcLangSpec
import svclang.compiler.Compile

class TypeAliasScopeSpec extends SvcLangSpec {
  val svcSource =
    """
      service S
      a -> s
      b -> s
      event E {
        b -> e
        required:
        c -> er
      }
      ## S1
      d -> s1
      document D {
        e -> d
        required:
        f -> dr
       }
    """.stripMargin

  val svc = Compile.service(svcSource).get

  describe("findTypeAlias"){
    it("should return a local alias"){
      svc.findTypeAlias("a").get.baseType.name should be ("s")
    }
    it("should return none if no match"){
      svc.findTypeAlias("x") should be (None)
    }
    it("should prefer the local alias"){
      svc.messages("E").findTypeAlias("b").get.baseType.name should be ("e")
    }
    it("find the closest relative"){
      svc.messages("E").sections(0).findTypeAlias("b").get.baseType.name should be ("e")
    }
    it("should not find aliases outside its immediate hierarchy"){
      svc.sections(0).findTypeAlias("c") should be (None)
      svc.sections(0).findTypeAlias("b").get.baseType.name should be ("s")
    }
  }
}
