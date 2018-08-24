lazy val akkaHttpVersion = "10.0.9"
lazy val akkaVersion    = "2.5.3"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaHome       := Some(file("/opt/scala")),
      scalaVersion    := "2.11.11",
      organization    := "com.redhat.gpte"
    )),
    name := "uber-data-lab2",
    version := "0.1",
    mainClass in assembly := Some("com.redhat.gpte.Main"),
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http"         % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-xml"     % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-stream"       % akkaVersion,
      "org.apache.spark"  %  "spark-sql_2.11"     % "2.3.0"  % "provided"
    )
  )
