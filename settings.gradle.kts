pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven { url = uri ("https://jitpack.io") }
        maven {
            url = uri("https://api.mapbox.com/downloads/v2/releases/maven")
            authentication {
                create<BasicAuthentication>("basic")
            }
            credentials {
                // Do not change the username below.
                // This should always be `mapbox` (not your username).
                username = "mapbox"
                // Use the secret token you stored in gradle.properties as the password
                password = "sk.eyJ1IjoiYnJpb3hlc2pyMiIsImEiOiJjbHAxa213bzkwbWZnMmpzNjdsN3c5dmdvIn0.C5E8ATb9j3pQV--yXadarA"
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri ("https://jitpack.io") }
        maven {
            url = uri ("https://api.mapbox.com/downloads/v2/releases/maven")
            authentication {
                create<BasicAuthentication>("basic")
            }
            credentials {
                // Do not change the username below.
                // This should always be `mapbox` (not your username).
                username = "mapbox"
                // Use the secret token you stored in gradle.properties as the password
                password = "sk.eyJ1IjoiYnJpb3hlc2pyMiIsImEiOiJjbHAxa213bzkwbWZnMmpzNjdsN3c5dmdvIn0.C5E8ATb9j3pQV--yXadarA"
            }
        }
    }
}





rootProject.name = "Commutenyo"
include(":app")
