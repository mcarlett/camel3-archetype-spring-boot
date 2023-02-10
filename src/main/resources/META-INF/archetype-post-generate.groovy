import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

// the path where the project got generated
Path projectPath = Paths.get(request.outputDirectory, request.artifactId)

// dependencyResolution is the name of the folder for pom.xml provisioning
String dependencyResolution = request.properties.get("dependencies-resolution")

//remove default pom.xml
Files.deleteIfExists projectPath.resolve("pom.xml")

//copy selected version
Files.copy projectPath.resolve("${dependencyResolution}/pom.xml"),projectPath.resolve("pom.xml")
Files.copy projectPath.resolve("${dependencyResolution}/readme.adoc"),projectPath.resolve("readme.adoc")

//remove unnecessary files
Files.deleteIfExists projectPath.resolve("csb-dependencies/pom.xml")
Files.deleteIfExists projectPath.resolve("csb-dependencies/readme.adoc")
Files.deleteIfExists projectPath.resolve("csb-dependencies")
Files.deleteIfExists projectPath.resolve("redhat-platform/pom.xml")
Files.deleteIfExists projectPath.resolve("redhat-platform/readme.adoc")
Files.deleteIfExists projectPath.resolve("redhat-platform")
