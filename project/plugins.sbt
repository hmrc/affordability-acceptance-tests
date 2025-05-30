resolvers += "HMRC-open-artefacts-maven" at "https://open.artefacts.tax.service.gov.uk/maven2"
resolvers += Resolver.url("HMRC-open-artefacts-ivy", url("https://open.artefacts.tax.service.gov.uk/ivy2"))(
  Resolver.ivyStylePatterns
)

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.3")

addSbtPlugin("uk.gov.hmrc" % "sbt-auto-build" % "3.24.0")

addSbtPlugin("uk.gov.hmrc" % "sbt-test-report" % "0.26.0")
