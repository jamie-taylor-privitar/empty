version = "2019.2"
project {
    id("BuildPipelineViews_JamiePipelines")
    name = "Jamie Builds"
    description = "Jamie"

    buildType {
        id ("jamiebuild")
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