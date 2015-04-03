name := """svclang"""

version := "0.0.1"

scalaVersion := "2.11.5"

compileOrder := CompileOrder.JavaThenScala

libraryDependencies ++= Seq(
  "org.antlr" % "antlr4-runtime" % "4.5",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)