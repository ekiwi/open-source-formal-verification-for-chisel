interp.repositories() ::: List(
  coursierapi.MavenRepository.of("https://oss.sonatype.org/content/repositories/snapshots")
)

@

interp.configureCompiler(x => x.settings.source.value = scala.tools.nsc.settings.ScalaVersion("2.11.12"))

// Uncomment and change to use proxy
// System.setProperty("https.proxyHost", "proxy.example.com")
// System.setProperty("https.proxyPort", "3128")

import $ivy.`edu.berkeley.cs::chisel3:3.5-SNAPSHOT`
import $ivy.`edu.berkeley.cs::chiseltest:0.5-SNAPSHOT`

