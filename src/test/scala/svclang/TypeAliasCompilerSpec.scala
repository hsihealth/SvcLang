package svclang

import svclang.compiler.Compiler
import svclang.model.nodes.{TypeSpec, Primitive}

class TypeAliasCompilerSpec extends SvcLangSpec {
  describe("when compiling a service with a type alias"){
    it("should compile a type alias"){
      val svc = Compiler.compileService("service Happy\ndollars -> number").get
      svc.aliases.length should be (1)
    }
    it("should compile a few aliases"){
      val svc = Compiler.compileService("service Happy\ndollars -> number\nevent Hi\nmonkeys -> integer").get
      svc.aliases.length should be (2)
    }
    it("should extract the alias name"){
      val alias = Compiler.compileService("service A\ndollars->number").get.aliases.head
      alias.name should be ("dollars")
    }
    it("should extract the documentation"){
      val alias = Compiler.compileService("service A\ndollars->number #hehe").get.aliases.head
      alias.documentation.get should be ("hehe")
    }
    it("should extract block docs too"){
      val alias = Compiler.compileService("service A\ndollars->number\n--\nhaha\n--").get.aliases.head
      alias.documentation.get should be ("haha")
    }
    it("should extract the aliased type spec"){
      val alias = Compiler.compileService("service A\ndollars->number").get.aliases.head
      alias.typeSpec.get shouldBe a [TypeSpec]
    }
  }
}
