package svclang.compiler.listeners

import svclang.SvcLangSpec
import svclang.compiler.Parse

class MessageSelectionCompilerSpec extends SvcLangSpec{
  it("should parse a message selection"){
    val svc = Parse.service("service A input stream B { messages C }").get
    svc.streams("B").messageSelections.length should equal (1)
    val sel = svc.streams("B").messageSelections(0)
    sel.name should equal ("C")
  }
  it("should extract a selection with a wildcard"){
    val svc = Parse.service("service A input stream B { messages C*}").get
    svc.streams("B").messageSelections(0).name should equal ("C*")
  }
  it("should compile a list of selections in a single declaration"){
    val svc = Parse.service("service A input stream B { messages C,D*, E}").get
    svc.streams("B").messageSelections.length should equal (3)
    val sels = svc.streams("B").messageSelections
    sels(0).name should equal ("C")
    sels(1).name should equal ("D*")
    sels(2).name should equal ("E")
  }
  it("should concat multiple messages declarations"){
    val svc = Parse.service("service A input stream B { messages C,D* messages E*,F }").get
    svc.streams("B").messageSelections.length should equal (4)
    val sels = svc.streams("B").messageSelections
    sels(0).name should equal ("C")
    sels(1).name should equal ("D*")
    sels(2).name should equal ("E*")
    sels(3).name should equal ("F")
  }
}
