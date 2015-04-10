package svclang.compiler

import svclang.SvcLangSpec
import svclang.compiler.model.Primitive
import svclang.runtime.model._

class ServiceCompilerSpec extends SvcLangSpec {
  describe("given a bit o' bad input"){
    it("should not succeed"){
      Compile.service("service A input stream B { message C* }").isSuccess should be (false)
    }
  }
  val svcSource =
    """
          service A #tada
          partial message A {
          #msgdoc
          happy string ("hi") #fielddoc
          }
          dollars -> integer
          version 1.0
          input stream S1 {
            #s1doc
            messages A*
          }
          output stream S2
          ##Section B
          event B
          fiddles -> string
          version 2.0
          input stream S3
          output stream S4
    """.stripMargin

  describe("ServiceToService"){
    it("should convert a service"){
      val svc = Compile.service(svcSource)
      svc shouldNot be (None)
    }
    it("should convert the name, doc and settings"){
      val svc = Compile.service(svcSource).get
      svc.name should equal ("A")
      svc.documentation.get should equal ("tada")
      svc.settings.size should equal (1)
    }
    it("should convert aliases"){
      val svc = Compile.service(svcSource).get
      svc.typeAliases.size should equal (1)
    }
    it("should convert messages"){
      val svc = Compile.service(svcSource).get
      svc.messages.size should equal (1)
    }
    it("should convert streams"){
      val svc = Compile.service(svcSource).get
      svc.inputStreams.length should equal (1)
      svc.outputStreams.length should equal (1)
    }
    it("should convert sections"){
      val svc = Compile.service(svcSource).get
      svc.sections.length should equal (1)
    }
  }
  describe("TypeDefToTypeSpec"){
    it("should convert a primitive"){
      val td = new Primitive("myprim").withTypeSpec(Some(new Primitive("integer"))).asInstanceOf[Primitive]
      val ts = ServiceCompiler.TypeSpecToTypeDef(td).get.asInstanceOf[PrimitiveType]
      ts.name should equal ("myprim")
      ts.genericType.get shouldBe a [TypeDef]
      ts.genericType.get.name should equal("integer")
    }
    it("should convert a MessageRef"){
      val td = new svclang.compiler.model.MessageRef("MessageA",Some("name.space"),None)
      val ts = ServiceCompiler.TypeSpecToTypeDef(td).get.asInstanceOf[MessageRef]
      ts.name should equal("MessageA")
      ts.namespace.get should equal ("name.space")
    }
    it("should convert an enum"){
      val td = new svclang.compiler.model.Enumeration().withValue("HI").withValue("HO")
      val ts = ServiceCompiler.TypeSpecToTypeDef(td).get.asInstanceOf[svclang.runtime.model.Enumeration]
      ts.name should equal ("enum")
      ts.values should equal (Seq("HI","HO"))
    }
    it("should convert a union"){
      val td = new svclang.compiler.model.Union().withType(new Primitive("string")).withType(new Primitive("integer"))
      val ts = ServiceCompiler.TypeSpecToTypeDef(td).get.asInstanceOf[Union]
      ts.name should equal ("union")
      ts.types.length should be (2)
      ts.types(0) shouldBe a [PrimitiveType]
      ts.types(1) shouldBe a [PrimitiveType]
    }
  }

}
