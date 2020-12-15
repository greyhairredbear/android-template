import Versions.KOTEST_VERSION
import Versions.MOCKK_VERSION
import Versions.KOTLIN_COROUTINES_VERSION
import Core.KOTLINX_GROUP
import Versions.ANDROID_MATERIAL_VERSION
import Versions.ARROW_VERSION

object Versions {
    const val BUILD_TOOLS_VERSION = "3.3.1"
    const val KOTLIN_COROUTINES_VERSION = "1.4.0-M1"

    const val ARROW_VERSION = "0.10.5"

    const val KOTEST_VERSION = "4.3.0"
    const val MOCKK_VERSION = "1.10.0"

    const val APP_COMPAT_VERSION = "1.1.0"
    const val CONSTRAINT_LAYOUT_VERSION = "1.1.0"
    const val CORE_KTX_VERSION = "1.2.0"
    const val ANDROID_MATERIAL_VERSION = "1.2.1"

    const val ANDROIDX_TEST_EXT_VERSION = "1.1.2"
    const val ANDROIDX_TEST_VERSION = "1.3.0"
    const val ESPRESSO_CORE_VERSION = "3.3.0"
}

object BuildPluginsVersions {
    const val ANDROID_GRADLE_PLUGIN = "4.1.1"
    const val DETEKT = "1.14.2"
    const val KOTLIN = "1.4.10"
}

object Plugins {
    const val KOTLIN = "org.jetbrains.kotlin.jvm"
    const val DETEKT = "io.gitlab.arturbosch.detekt"
    const val ANDROID = "android"

    const val ANDROID_GRADLE_PLUGIN = "com.android.tools.build:gradle:${Versions.BUILD_TOOLS_VERSION}"
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${BuildPluginsVersions.KOTLIN}"
    const val ANDROID_APPLICATION = "com.android.application"
    const val KOTLIN_ANDROID = "kotlin-android"
    const val KOTLIN_ANDROID_EXTENSIONS = "kotlin-android-extensions"

}

object Sdk {
    const val COMPILE_SDK_VERSION = 29
    const val TARGET_SDK_VERSION = 29
    const val MIN_SDK_VERSION = 23
}

object Core {
    private const val ARROW_GROUP = "io.arrow-kt"
    const val KOTLINX_GROUP = "org.jetbrains.kotlinx"

    const val STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    const val KOTLINX_COROUTINES = "$KOTLINX_GROUP:kotlinx-coroutines-core:$KOTLIN_COROUTINES_VERSION"

    const val ARROW_FX = "$ARROW_GROUP:arrow-fx:$ARROW_VERSION"
    const val ARROW_OPTICS = "$ARROW_GROUP:arrow-optics:$ARROW_VERSION"
    const val ARROW_SYNTAX = "$ARROW_GROUP:arrow-syntax:$ARROW_VERSION"
    const val ARROW_META = "$ARROW_GROUP:arrow-meta:$ARROW_VERSION"
}

object SupportLibs {
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT_VERSION}"
    const val ANDROIDX_CONSTRAINT_LAYOUT = "com.android.support.constraint:constraint-layout:${Versions.CONSTRAINT_LAYOUT_VERSION}"
    const val ANDROIDX_CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX_VERSION}"
}

object GoogleLibs {
    const val ANDROID_MATERIAL = "com.google.android.material:material:$ANDROID_MATERIAL_VERSION"
}

object Testing {
    private const val KOTEST_GROUP = "io.kotest"
    const val KOTEST_RUNNER = "$KOTEST_GROUP:kotest-runner-junit5-jvm:$KOTEST_VERSION"
    const val KOTEST_JUNIT_RUNNER = "$KOTEST_GROUP:kotest-runner-junit5:$KOTEST_VERSION"
    const val KOTEST_ASSERTIONS = "$KOTEST_GROUP:kotest-assertions-core-jvm:$KOTEST_VERSION"
    const val KOTEST_PROPERTIES = "$KOTEST_GROUP:kotest-property-jvm:$KOTEST_VERSION"

    const val MOCKK = "io.mockk:mockk:$MOCKK_VERSION"

    const val KOTLINX_COROUTINES_TEST = "$KOTLINX_GROUP:kotlinx-coroutines-test:$KOTLIN_COROUTINES_VERSION"
}

object AndroidTesting {
    const val ANDROIDX_TEST_RULES = "androidx.test:rules:${Versions.ANDROIDX_TEST_VERSION}"
    const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:${Versions.ANDROIDX_TEST_VERSION}"
    const val ANDROIDX_TEST_EXT_JUNIT = "androidx.test.ext:junit:${Versions.ANDROIDX_TEST_EXT_VERSION}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE_VERSION}"
}
