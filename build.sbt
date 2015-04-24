name := "svclang"

version := "0.0.1"

scalaVersion := "2.11.5"

compileOrder := CompileOrder.JavaThenScala

libraryDependencies ++= Seq(
  "org.antlr" % "antlr4-runtime" % "4.5",
  "org.scala-lang" % "scala-reflect" % "2.11.5",
  "org.clapper" %% "scalasti" % "2.0.0",
  "com.typesafe" % "config" % "1.2.1",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)