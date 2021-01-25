import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.maven

version = "2019.2"
project {
//    name = "Jamie Builds"
    description = "Jamie"

    buildType {
        id("adfsdfsf")
        name = "jamie build type"
        steps {
            maven {
                goals = "test"
                runnerArgs = "-pl empty"
                mavenVersion = auto()
            }
        }
    }
}