interp.repositories() ::: List(
  coursierapi.MavenRepository.of("https://oss.sonatype.org/content/repositories/snapshots")
)

@

interp.configureCompiler(x => x.settings.source.value = scala.tools.nsc.settings.ScalaVersion("2.13.3"))

import $ivy.`edu.berkeley.cs::chisel3:3.5-SNAPSHOT`
import $ivy.`edu.berkeley.cs::chiseltest:0.5-SNAPSHOT`
import $ivy.`edu.berkeley.cs::firrtl-diagrammer:1.5-SNAPSHOT`
