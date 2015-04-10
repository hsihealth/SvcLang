package svclang.compiler

import svclang.compiler.model.{Message, Service}
import svclang.{SvcLangSpec, compiler}

import scala.util.Failure

/**
 * Created by nathanstults on 4/1/15.
 */
class ParseSpec extends SvcLangSpec {
  describe("Compiler"){
    describe("run against a stream"){
      it("should succeed with a valid stream"){
        compiler.Parse.service(getClass.getResourceAsStream("/TestService.svc")).isSuccess should be(true)
      }
      it ("should fail gracefully with a bad file"){
        compiler.Parse.serviceFile("./samples/PityThe.fool").isSuccess should be(false)
      }
      it("should be able to parse a complex file"){
        val result = compiler.Parse.service(getClass.getResourceAsStream("/CompleteTestService.svc"))
        //uncomment the next line to see what the error is if this test fails
        //throw result.failed.get
        result.isSuccess should be(true)
      }
      it("should be able to parse a message file"){
        val result = compiler.Parse.messages(getClass.getResourceAsStream("/TestMessage.msg"),None)
        result.isSuccess should be(true)
      }
      it("should be able to parse a complex message file"){
        val result = compiler.Parse.messages(getClass.getResourceAsStream("/CompleteTestMessage.msg"),None)
        result.isSuccess should be (true)
      }
    }
    describe("run against a string"){
      it("should succeed with a valid string"){
        compiler.Parse.service("service WhatGreatServiceTheyHaveHere # leave a good tip!").isSuccess should be(true)
      }
      it("should fail with an invalid string"){
        compiler.Parse.service("Eat Me! Drink Me!").isSuccess should be(false)
      }
      it("should fail when the lexer fails"){
        compiler.Parse.service("service A input stream B { message A* }").isSuccess should be(false)
      }
      it("should provide some kind of useful error"){
        val failure = compiler.Parse.service("Shut the front door! # the back door is ALWAYS open...")
        failure match {
          case Failure(e) => e.getMessage should include ("no viable alternative")
          case _ => throw new RuntimeException("uh... this is not where you want to be little buddy...")
        }
      }
      it("should parse a service"){
        compiler.Parse.service("service HiThere #son").get shouldBe a [Service]
      }
      it("should parse a message") {
        compiler.Parse.messages("partial message A").get.values.head shouldBe a[Message]
      }
    }
  }
}
