name := "cloudbeesDeployTest"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "be.objectify" %% "deadbolt-java" % "2.2-RC2",
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
  "mysql" % "mysql-connector-java" % "5.1.22",
  "com.typesafe" %% "play-plugins-mailer" % "2.1-RC2"
)

resolvers += Resolver.url("Objectify Play Repository", url("http://schaloner.github.com/releases/"))(Resolver.ivyStylePatterns)

resolvers += Resolver.url("Objectify Play Repository - snapshots", url("http://schaloner.github.com/snapshots/"))(Resolver.ivyStylePatterns)

resolvers += "webjars" at "http://webjars.github.com/m2"

resolvers +=  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

play.Project.playJavaSettings
