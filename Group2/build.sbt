name := "group2"
version :="1.0"
scalaVersion := "2.12.12"


libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test

lazy val question3=project.in(file("question3"))
  .settings(
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.2.3" % Test ,
      "org.scalatest" %% "scalatest-funsuite" % "3.2.3" % Test,
      "org.mockito" %% "mockito-scala-scalatest" % "1.16.15" % Test,
      "org.scalatest" %% "scalatest-flatspec" % "3.2.3" % Test)
  )
