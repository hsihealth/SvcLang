package svclang.generator

import svclang.SvcLangSpec
import svclang.compiler.Compile

import scala.collection.Set

class ServiceGeneratorSpec extends SvcLangSpec {
  val svcSource =
    """
      service MyService
      partial message MyPartial
      query MyQuery responds with MyResponse extends MyPartial
      command MyCommand
      event MyEvent
      document MyDocument
      ## My Section
      command MySectionCommand
    """.stripMargin
  val svc = Compile.service(svcSource).get

  describe("renderMessages"){

    val msgs = new ServiceGenerator(svc).renderMessages()
    it("should produce an entry for each message"){
      msgs.size should be (7)
      msgs.map(_.name).toSet should be (Set("MyPartial","MyQuery","MyResponse","MyCommand","MyEvent","MyDocument","MySectionCommand"))
    }
    it("should produce a body for each message"){
      forAll( msgs ){m => m.renderedText.isSuccess shouldBe true}
    }
  }

  describe("generateMessages"){
    val written = new ServiceGenerator(svc).generateMessages()
    it("should return a history of generated files"){
      written.size should be (7)
      forAll(written){result => result.isSuccess shouldBe true}
    }
    it("should expand variables in configured paths and file names"){
      val w = written.head.get
      w._1.toAbsolutePath.toString should be (s"/tmp/svclang/${w._2.namespace.replace(".","/")}/${w._2.name}.scala")
    }
    it("should actually create files and things"){
      forAll(written.map{_.get._1}){path => path.toFile.exists shouldBe true}
      forAll(written.map{_.get._1}){path => path.toFile.length should be > 0L}
    }
  }

}
