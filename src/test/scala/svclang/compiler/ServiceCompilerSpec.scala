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
          partial message A extends B {
            #msgdoc
            my string ("defaultval") #fielddoc
            a -> integer
            required: #hithere
            another string ("anotherdefault") #fielddoc
            an -> Alias
          }
          document Document extends A {
            #docdoc
            happy string ("hi") #fielddoc
            field -> one
            required:
            sad string ("ho") #fielddoc
            this -> that
          }
          query Query extends A.A {
            #querydoc
            q -> integer
            qfield string
            required:
            rfield integer
          } responds with Document
          event Event extends A {
            #eventdoc
            happy string ("hi") #fielddoc
            field -> one
            required:
            sad string ("ho") #fielddoc
            this -> that
          }
          command Command extends A {
            #commanddoc
            happy string ("hi") #fielddoc
            field -> one
            required:
            sad string ("ho")
            this -> that
          } emits Event fails with Document
          dollars -> integer
          version 1.0
          input stream S1 {
            #s1doc
            messages A*
          }
          output stream S2 {
            #s2doc
            messages Query*
          }
          ##Section B
          #tada
          event AnotherEvent
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
      svc.messages.size should be > (1)
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
  describe("ServiceSectionToServiceSection"){
    it("should set the parent"){
      val svc = Compile.service(svcSource).get
      val sct = svc.sections(0)
      sct.parent.get should be (svc)
    }
    it("should convert a service section"){
      val sct = Compile.service(svcSource).get.sections(0)
      sct.name should equal ("Section B")
      sct.documentation.get should equal ("tada")
    }
    it("should include messages"){
      val sct = Compile.service(svcSource).get.sections(0)
      sct.messages.size should equal (1)
    }
    it("should include aliases"){
      val sct = Compile.service(svcSource).get.sections(0)
      sct.typeAliases.size should equal (1)
    }
    it("should include settings"){
      val sct = Compile.service(svcSource).get.sections(0)
      sct.settings.size should equal (1)
      sct.settings("version") should equal ("2.0")
    }
    it("should extract input streams"){
      val sct = Compile.service(svcSource).get.sections(0)
      sct.inputStreams.size should equal (1)
    }
    it("should extract output streams"){
      val sct = Compile.service(svcSource).get.sections(0)
      sct.outputStreams.size should equal (1)
    }
  }
  describe("InputStreamToInputStream"){
    it("should extact an input stream"){
      val s1 = Compile.service(svcSource).get.inputStreams(0)
      s1.name should equal ("S1")
      s1.documentation.get should equal ("s1doc")
      s1.messages.size should equal (1)
    }
  }
  describe("OutputStreamToOutputStream"){
    it("should extact an output stream"){
      val s1 = Compile.service(svcSource).get.outputStreams(0)
      s1.name should equal ("S2")
      s1.documentation.get should equal ("s2doc")
      s1.messages.size should equal (1)
    }
  }
  describe("MessageSelectionToMessageSelector"){
    it("should convert a selection to selector"){
      val sel = Compile.service(svcSource).get.inputStreams(0).messages(0)
      sel.pattern should equal ("A*")
    }
  }
  describe("TypeSpecToTypeDef"){
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
  describe("MessageSectionToMessageSection"){
    it("should convert a message section"){
      val ms = Compile.service(svcSource).get.messages("A").sections(0)
      ms.name should equal ("required")
      ms.documentation.get should equal ("hithere")
      ms.typeAliases.size should equal (1)
      ms.fieldDefinitions.size should equal (1)
    }
  }
  describe("TypeAliasToTypeAlias"){
    it("should convert a type alias"){
      val ta = Compile.service(svcSource).get.typeAliases("dollars")
      ta.name should equal ("dollars")
      ta.baseType shouldBe a [PrimitiveType]
      ta.baseType.name should equal ("integer")
    }
  }
  describe("FieldSpecToFieldDef"){
    it("should convert a field spec to field def"){
      val fd = Compile.service(svcSource).get.messages("A").fieldDefinitions("my")
      fd.name should equal ("my")
      fd.documentation.get should equal("fielddoc")
      fd.defaultValue.get should equal ("defaultval")
      fd.dataTypeDefinition shouldBe a [PrimitiveType]
      fd.dataTypeDefinition.name should equal ("string")
      fd.required should be (false)
    }
  }
  describe("MessageRefToMessageRef"){
    it("should convert a ref"){
      val mr = Compile.service(svcSource).get.messages("A").extendedMessageReferences(0)
      mr.name should equal ("B")
    }
    it("should be missing a namespace if the source is"){
      val mr = Compile.service(svcSource).get.messages("A").extendedMessageReferences(0)
      mr.namespace should be (None)
    }
    it("should include a namespace if the source does"){
      val mr = Compile.service(svcSource).get.messages("Query").asInstanceOf[Query].extendedMessageReferences(0)
      mr.name should equal ("A")
      mr.namespace.get should equal ("A")
    }
  }
  describe("PartialMessageToPartialMessage"){
    it("should convert a partial message"){
      val pm = Compile.service(svcSource).get.messages("A").asInstanceOf[PartialMessage]
      pm.name should equal ("A")
      pm.documentation.get should equal ("msgdoc")
      pm.sections.length should equal (1)
      pm.extendedMessageReferences.length should be >= (1)
      pm.typeAliases.size should be >= (1)
      pm.fieldDefinitions.size should be >= (1)
    }
  }
  describe("DocumentToDocument"){
    it("should convert a document message"){
      val d = Compile.service(svcSource).get.messages("Document").asInstanceOf[Document]
      d.name should equal ("Document")
      d.documentation.get should equal ("docdoc")
      d.sections.length should equal (1)
      d.extendedMessageReferences.length should be >= (1)
      d.typeAliases.size should be >= (1)
      d.fieldDefinitions.size should be >= (1)
    }
  }
  describe("EventToEvent"){
    it("should convert an event message"){
      val e = Compile.service(svcSource).get.messages("Event").asInstanceOf[Event]
      e.name should equal ("Event")
      e.documentation.get should equal ("eventdoc")
      e.sections.length should equal (1)
      e.extendedMessageReferences.length should be >= (1)
      e.typeAliases.size should be >= (1)
      e.fieldDefinitions.size should be >= (1)
    }
  }
  describe("QueryToQuery"){
    val q = Compile.service(svcSource).get.messages("Query").asInstanceOf[Query]
    q.name should equal ("Query")
    q.documentation.get should equal ("querydoc")
    q.sections.length should be >= (1)
    q.extendedMessageReferences.length should be >= (1)
    q.typeAliases.size should be >= (1)
    q.fieldDefinitions.size should be >= (1)
    q.respondsWith shouldBe a [MessageRef]
    q.respondsWith.name should be ("Document")
  }
  describe("CommandToCommand"){
    val c = Compile.service(svcSource).get.messages("Command").asInstanceOf[Command]
    c.name should equal ("Command")
    c.documentation.get should equal ("commanddoc")
    c.sections.length should be >= (1)
    c.extendedMessageReferences.length should be >= (1)
    c.typeAliases.size should be >= (1)
    c.emits.length should be >= (1)
    c.emits(0).name should be ("Event")
    c.failsWith.length should be >= (1)
    c.failsWith(0).name should be ("Document")
  }


}
