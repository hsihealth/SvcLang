package svclang

import svclang.model.nodes.{Message, Service}

import scala.util.Failure

/**
 * Created by nathanstults on 4/1/15.
 */
class CompilerSpec extends SvcLangSpec {
  describe("Compiler"){
    describe("run against a stream"){
      it("should succeed with a valid stream"){
        compiler.Compiler.compileService(getClass.getResourceAsStream("/TestService.svc")).isSuccess should be(true)
      }
      it ("should fail gracefully with a bad file"){
        compiler.Compiler.compileServiceFile("./samples/PityThe.fool").isSuccess should be(false)
      }
      it("should be able to parse a complex file"){
        val result = compiler.Compiler.compileService(getClass.getResourceAsStream("/CompleteTestService.svc"))
        //uncomment the next line to see what the error is if this test fails
        //throw result.failed.get
        result.isSuccess should be(true)
      }
      it("should be able to parse a message file"){
        val result = compiler.Compiler.compileMessages(getClass.getResourceAsStream("/TestMessage.msg"))
        result.isSuccess should be(true)
      }
      it("should be able to parse a complex message file"){
        val result = compiler.Compiler.compileMessages(getClass.getResourceAsStream("/CompleteTestMessage.msg"))
        result.isSuccess should be (true)
      }
    }
    describe("run against a string"){
      it("should succeed with a valid string"){
        compiler.Compiler.compileService("service WhatGreatServiceTheyHaveHere # leave a good tip!").isSuccess should be(true)
      }
      it("should fail with an invalid string"){
        compiler.Compiler.compileService("Eat Me! Drink Me!").isSuccess should be(false)
      }
      it("should provide some kind of useful error"){
        val failure = compiler.Compiler.compileService("Shut the front door! # the back door is ALWAYS open...")
        failure match {
          case Failure(e) => e.getMessage should include ("no viable alternative")
          case _ => throw new RuntimeException("uh... this is not where you want to be little buddy...")
        }
      }
      it("should parse a service"){
        compiler.Compiler.compileService("service HiThere #son").get shouldBe a [Service]
      }
      it("should parse a message"){
        compiler.Compiler.compileMessages("partial message A").get.values.head shouldBe a [Message]
      }
    }
  }
}
