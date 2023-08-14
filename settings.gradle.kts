rootProject.name = "demo"

include("demo-application", "demo-inbound", "demo-domain", "demo-outbound")

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            when(requested.id.id) {
                "org.jetbrains.kotlin.jvm" -> useVersion("1.8.22")
                "org.jetbrains.kotlin.kapt" -> useVersion("1.8.22")
                "org.jetbrains.kotlin.plugins.spring" -> useVersion("1.8.22")
                "org.jetbrains.kotlin.plugins.jpa" -> useVersion("1.8.22")
                "org.springframework.boot" -> useVersion("3.1.2")
            }
        }
    }
}
