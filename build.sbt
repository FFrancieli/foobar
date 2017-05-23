lazy val root = (project in file("."))
  .settings(
    name := "fizzBuzz",
    version := "1.0",
    scalaVersion := "2.11.8")
  .settings(
    libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.3"
  )