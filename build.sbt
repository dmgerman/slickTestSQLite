libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.0.0",
  "org.xerial" % "sqlite-jdbc" % "3.8.0-SNAPSHOT",
  "com.zaxxer" % "HikariCP" % "2.4.1"
)

resolvers += "SQLite-JDBC Repository" at "https://oss.sonatype.org/content/repositories/snapshots" 
