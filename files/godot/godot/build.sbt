//val scalaVersion12 = "2.12.6"
//
//lazy val root = project
//  .in(file("."))
//  .settings(
//      name := "godot",
//      version := "0.1.0",
//
//      scalaVersion := scalaVersion12,
//
//      libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
//  )


val scalaV= "0.15.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "godot",
    version := "0.1.0",

    scalaVersion := scalaV,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    libraryDependencies += ("org.scalameta" %% "scalameta" % "4.1.0").withDottyCompat(scalaV),
    addCompilerPlugin(
      "org.scalameta" % "semanticdb-scalac" % "4.1.0" cross CrossVersion.full),
    scalacOptions += "-Yrangepos"
  )


//val dottyVersion = "0.15.0-RC1"
//lazy val commonSettings = Seq(
//  name := "godot",
//  version := "0.1.0",
//
//  scalaVersion := dottyVersion,
//
//  libraryDependencies += ("com.novocode" % "junit-interface" % "0.11" % "test").withDottyCompat(scalaVersion.value),
//  libraryDependencies += ("org.scalameta" %% "scalameta" % "4.1.0").withDottyCompat(scalaVersion.value)
//)
//
//
//lazy val root = project
//  .in(file("."))
//  .dependsOn(scalameta_code)
//  .settings(
//    name := "dotty-simple",
//    version := "0.1.0",
//
//    scalaVersion := dottyVersion,
//    scalacOptions += "-Ypartial-unification",
//
//      libraryDependencies += ("com.novocode" % "junit-interface" % "0.11" %
//        "test").withDottyCompat(scalaVersion.value),
//    // libraryDependencies += "org.typelevel" %% "cats-core" % "1.4.0"
//
//
//
//      libraryDependencies += ("org.typelevel" %% "cats-core" % "1.6.0").withDottyCompat(scalaVersion.value),
//
//
//
//      libraryDependencies += ("org.scalatest" %% "scalatest" % "3.0.5").withDottyCompat(scalaVersion.value),
////    libraryDependencies += ("org.scalameta" %% "scalameta" % "4.1.0")
////      .withDottyCompat(scalaVersion.value),
//    libraryDependencies += ("org.scala-lang.modules" %%
//      "scala-parser-combinators" % "1.1.0").withDottyCompat(scalaVersion.value)
//  )
