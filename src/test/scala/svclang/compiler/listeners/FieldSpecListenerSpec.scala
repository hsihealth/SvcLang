package svclang.compiler.listeners

import svclang.SvcLangSpec
import svclang.compiler.Parse
import svclang.compiler.model.Primitive

class FieldSpecListenerSpec extends SvcLangSpec {
  describe("compiling field specs"){
    it("should parse a field name"){
      var spec = Parse.messages("partial message A{\n this int}").get.values.head.fields.values.head
      spec.name should equal ("this")
    }
    it("should detect a required field"){
      var spec = Parse.messages("partial message A{\nthis* int}").get.values.head.fields("this")
      spec.required should be (true)
    }
    it("should infer required from a required section"){
      var spec = Parse.messages("partial message A{required:this int}").get.values.head.sections(0).fields("this")
      spec.required should be (true)
    }
    it("should treat fields as optional unless otherwise specified"){
      var spec = Parse.messages("partial message A{this int}").get.values.head.fields("this")
      spec.required shouldNot be (true)
    }
    it("should extract docs"){
      var spec = Parse.messages("partial message A{this integer #hi there}").get.values.head.fields("this")
      spec.documentation.get should equal ("hi there")
    }
    it("should extract block docs"){
      var spec = Parse.messages("partial message A{this integer\n--\nhi there\n--}").get.values.head.fields("this")
      spec.documentation.get should equal ("hi there")
    }
    it("should parse a type spec"){
      var spec = Parse.messages("partial message A{this map[list[integer]]}").get.values.head.fields("this")
      spec.typeSpec.get shouldBe a [Primitive]
      spec.typeSpec.get.name should equal ("map")
      spec.typeSpec.get.asInstanceOf[Primitive].typeSpec.get shouldBe a [Primitive]
      spec.typeSpec.get.asInstanceOf[Primitive].typeSpec.get.name should equal ("list")
      //Seriously? I mean, really? (sad face)
      spec.typeSpec.get.asInstanceOf[Primitive].typeSpec.get.asInstanceOf[Primitive].typeSpec.get.name should equal ("integer")
    }
    it("should parse the default value"){
      var spec = Parse.messages("partial message A{this integer (1)}").get.values.head.fields("this")
      spec.defaultValue shouldNot be (None)
      spec.defaultValue.get should equal ("1")
    }
  }
}
