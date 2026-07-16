pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    // TODO(genix): changed to PREFER_SETTINGS from FAIL_ON_PROJECT_REPOS
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()

        // TODO(genix): this has been added
        maven("https://storage.googleapis.com/download.flutter.io")
    }
}

rootProject.name = "My Application"
include(":app")

// Replace "flutter_module" with whatever package_name you supplied when you ran:
// `$ flutter create -t module [package_name]
val filePath = settingsDir.parentFile.toString() + "/flutter_module/.android/include_flutter.groovy"
apply(from = File(filePath))
