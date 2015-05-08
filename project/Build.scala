import com.amazonaws.auth.DefaultAWSCredentialsProviderChain
import com.amazonaws.services.s3.model.Region
import ohnosequences.sbt.SbtS3Resolver._
import sbt.Keys._
import sbt._


object SvcLangBuild extends Build {

  addCommandAlias("rebuild", ";clean; compile; package")

  //////////////////////////////////////////////////////////////////////////////
  // PROJECTS
  //////////////////////////////////////////////////////////////////////////////

  lazy val svclang = Project(id = "svclang",
    settings = commonSettings,
    base = file("."))


  //////////////////////////////////////////////////////////////////////////////
  // PROJECT INFO
  //////////////////////////////////////////////////////////////////////////////

  val ORGANIZATION    = "com.hsihealth"
  val PROJECT_NAME    = "svclang"
  val PROJECT_VERSION = "0.1-SNAPSHOT"
  val SCALA_VERSION   = "2.11.5"


  //////////////////////////////////////////////////////////////////////////////
  // DEPENDENCY VERSIONS
  //////////////////////////////////////////////////////////////////////////////

  val TYPESAFE_CONFIG_VERSION = "1.2.1"
  val SCALATEST_VERSION       = "2.2.4"
  val SLF4J_VERSION           = "1.7.9"
  val LOGBACK_VERSION         = "1.1.2"
  val NSCALA_TIME_VERSION     = "1.6.0"
  val ANTLR_VERSION           = "4.5"
  val HANDLEBARS_VERSION      = "2.0.1"



  //////////////////////////////////////////////////////////////////////////////
  // SHARED SETTINGS
  //////////////////////////////////////////////////////////////////////////////

  lazy val commonSettings = Project.defaultSettings ++
    basicSettings ++ s3Settings ++ S3Resolver.defaults

  lazy val s3Settings = Seq(
    s3region := Region.US_Standard,
    publishMavenStyle := false,
    s3credentials := new DefaultAWSCredentialsProviderChain(),
    publishTo := {
      val prefix = if (isSnapshot.value) "snapshots" else "releases"
      Some(s3resolver.value(s"$prefix s3 bucket", s3(prefix+".mvn-repo.hsihealth.com")) withIvyPatterns)
    }
  )

  lazy val basicSettings = Seq(
    version := PROJECT_VERSION,
    organization := ORGANIZATION,
    scalaVersion := SCALA_VERSION,

    libraryDependencies ++= Seq(
      "com.typesafe"           %  "config"           % TYPESAFE_CONFIG_VERSION,
      "org.slf4j"              %  "slf4j-api"        % SLF4J_VERSION,
      "com.github.nscala-time" %% "nscala-time"      % NSCALA_TIME_VERSION,
      "org.antlr"              %  "antlr4-runtime"   % ANTLR_VERSION,
      "ch.qos.logback"         %  "logback-classic"  % LOGBACK_VERSION % "runtime",
      "org.scalatest"          %% "scalatest"        % SCALATEST_VERSION % "test"
    ),

    scalacOptions in Compile ++= Seq(
      "-unchecked",
      "-deprecation",
      "-feature"
    ),

    javaOptions += "-Djava.library.path=%s:%s".format(
      sys.props("java.library.path"),sys.props("java.library.path")
    ),

    fork in run := true,

    fork in Test := true,

    parallelExecution in Test := false
  )


}
