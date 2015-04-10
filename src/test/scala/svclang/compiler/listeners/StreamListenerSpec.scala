package svclang.compiler.listeners

import svclang.SvcLangSpec
import svclang.compiler.Parse
import svclang.compiler.model.{InputStream, MessageSelection, OutputStream}

class StreamListenerSpec extends SvcLangSpec {
  it("should compile a stream definition"){
    val svc = Parse.service("service A input stream B").get
    svc.streams.size should be (1)
    svc.streams("B").name should be ("B")
  }
  it("should compile an input stream"){
    val svc = Parse.service("service A input stream B").get
    svc.streams("B") shouldBe a [InputStream]
  }
  it("should compile an output stream"){
    val svc = Parse.service("service A output stream B").get
    svc.streams("B") shouldBe a [OutputStream]
  }
  it("should extract docs"){
    val svc = Parse.service("service A input stream B #hi there").get
    svc.streams("B").documentation.get should equal ("hi there")
  }
  it("should extract docs from the body"){
    val svc = Parse.service("service A input stream B { #hi there }").get
    svc.streams("B").documentation.get should equal ("hi there")
  }
  it("should extract settings"){
    val svc = Parse.service("service A input stream B { setting 1.0\nanother_setting 3 }").get
    svc.streams("B").settings.size should be (2)
    svc.streams("B").settings("setting") should equal ("1.0")
    svc.streams("B").settings("another_setting") should equal ("3")
  }
  it("should extract message selections"){
    val svc = Parse.service("service A input stream B { messages MyMessages* }").get
    svc.streams("B").messageSelections.length should equal (1)
    svc.streams("B").messageSelections(0) shouldBe a [MessageSelection]
  }
}
