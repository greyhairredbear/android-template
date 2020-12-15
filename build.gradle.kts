plugins {
    id(Plugins.ANDROID_APPLICATION) version BuildPluginsVersions.ANDROID_GRADLE_PLUGIN apply false
    kotlin(Plugins.ANDROID) version BuildPluginsVersions.KOTLIN apply false
    id(Plugins.DETEKT) version BuildPluginsVersions.DETEKT
}

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Plugins.ANDROID_GRADLE_PLUGIN)
        classpath(Plugins.KOTLIN_GRADLE_PLUGIN)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

apply(from = "config/git-hooks/gitHooks.gradle.kts")

allprojects {
    group = PUBLISHING_GROUP
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}

subprojects {
    apply {
        plugin(Plugins.DETEKT)
    }

    detekt {
        failFast = false
        buildUponDefaultConfig = true
        config = rootProject.files("config/detekt/detekt.yml")

        reports {
            html.enabled = true
            xml.enabled = true
            txt.enabled = true
        }
    }
}

tasks.register("clean").configure {
    delete("build")
}