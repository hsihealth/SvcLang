package svclang

import svclang.compiler.Compiler
import svclang.model.nodes.{Union, MessageRef, Primitive, Enumeration}

class TypeSpecCompilerSpec extends SvcLangSpec {
  describe("compiling a type spec"){
    it("produce a TypeSpec, duh"){
      val ts = Compiler.compileService("service A\ndollars -> number").get.aliases.head.typeSpec.get
      ts shouldNot be (null)
    }

    it("compiles a simple primitive"){
      val ts = Compiler.compileService("service A\ndollars -> number").get.aliases.head.typeSpec.get
      ts shouldBe a [Primitive]
      ts.name should be ("number")
      ts.asInstanceOf[Primitive].typeSpec should be (None)
    }

    it("compiles a nested type spec"){
      val ts = Compiler.compileService("service A\nkittens -> list[string]").get.aliases.head.typeSpec.get
      val prim = ts.asInstanceOf[Primitive]
      prim.typeSpec shouldNot be (None)
      prim.typeSpec.get shouldBe a[Primitive]
      prim.typeSpec.get.name should be ("string")
    }

    it("compiles a deeply nested type spec"){
      val ts = Compiler.compileService("service A\nkittens -> list[map[string]]").get.aliases.head.typeSpec.get
      val prim = ts.asInstanceOf[Primitive]
      val l1 = prim.typeSpec.get.asInstanceOf[Primitive]
      val l2 = l1.typeSpec
      l2 shouldNot be (None)
      l2.get shouldBe a [Primitive]
      l2.get.asInstanceOf[Primitive].typeSpec should be (None)
    }

    it("compiles a MessageType"){
      val ts = Compiler.compileService("service A\nmymessage -> MyMessage").get.aliases.head.typeSpec.get
      ts shouldBe a [MessageRef]
      ts.name should equal ("MyMessage")
    }

    it("compiles an enumeration ") {
      val ts = Compiler.compileService("service A\nmyenum -> enum [ONE,TWO,THREE]").get.aliases.head.typeSpec.get
      ts shouldBe a[Enumeration]
    }
    it("extracts an enumerations identifiers"){
      val ts = Compiler.compileService("service A\nmyenum -> enum [ONE,TWO,THREE]").get.aliases.head.typeSpec.get
      ts.asInstanceOf[Enumeration].ids should be (Vector("ONE","TWO","THREE"))
    }

    it("compiles a union"){
      val ts = Compiler.compileService("service A\nmyunion -> [string,a,list[integer]]").get.aliases.head.typeSpec.get
      ts shouldBe a [Union]
    }

    it("compiles the unions types"){
      val ts = Compiler.compileService("service A\nmyuntion -> [string,MyMessage,list[MyMessage]]").get.aliases.head.typeSpec.get
      val union = ts.asInstanceOf[Union]
      union.typeSpecs.length should be (3)
      union.typeSpecs(0) shouldBe a [Primitive]
      union.typeSpecs(0).name should be ("string")
      union.typeSpecs(1) shouldBe a [MessageRef]
      union.typeSpecs(1).name should be ("MyMessage")
      union.typeSpecs(2) shouldBe a [Primitive]
      union.typeSpecs(2).name should be ("list")
      union.typeSpecs(2).asInstanceOf[Primitive].typeSpec.get.name should be ("MyMessage")
    }


  }
}
