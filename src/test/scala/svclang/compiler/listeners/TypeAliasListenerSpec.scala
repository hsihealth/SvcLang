package svclang.compiler.listeners

import svclang.SvcLangSpec
import svclang.compiler.Parse
import svclang.compiler.model.TypeSpec

class TypeAliasListenerSpec extends SvcLangSpec {
  describe("when compiling a service with a type alias"){
    it("should compile a type alias"){
      val svc = Parse.service("service Happy\ndollars -> number").get
      svc.aliases.size should be (1)
    }
    it("should compile a few aliases"){
      val svc = Parse.service("service Happy\ndollars -> number\nevent Hi\nmonkeys -> integer").get
      svc.aliases.size should be (2)
    }
    it("should extract the alias name"){
      val alias = Parse.service("service A\ndollars->number").get.aliases("dollars")
      alias.name should be ("dollars")
    }
    it("should extract the documentation"){
      val alias = Parse.service("service A\ndollars->number #hehe").get.aliases("dollars")
      alias.documentation.get should be ("hehe")
    }
    it("should extract block docs too"){
      val alias = Parse.service("service A\ndollars->number\n--\nhaha\n--").get.aliases("dollars")
      alias.documentation.get should be ("haha")
    }
    it("should extract the aliased type spec"){
      val alias = Parse.service("service A\ndollars->number").get.aliases("dollars")
      alias.typeSpec.get shouldBe a [TypeSpec]
    }
  }
}
