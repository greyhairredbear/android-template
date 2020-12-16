plugins {
    id(Plugins.ANDROID_APPLICATION)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.KOTLIN_ANDROID_EXTENSIONS)
}

val installGitHooks by rootProject.tasks.existing
val preBuild by tasks.existing {
    dependsOn(installGitHooks)
}

android {
    compileSdkVersion(Sdk.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdkVersion(Sdk.MIN_SDK_VERSION)
        targetSdkVersion(Sdk.TARGET_SDK_VERSION)

        applicationId = AppInfo.APP_ID
        versionCode = AppInfo.APP_VERSION_CODE
        versionName = AppInfo.APP_VERSION_NAME
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    lintOptions {
        isWarningsAsErrors = true
        isAbortOnError = true
    }
}

dependencies {
//    testImplementation 'junit:junit:4.+'

    implementation(Core.STD_LIB)
    implementation(Core.KOTLINX_COROUTINES)

    implementation(SupportLibs.ANDROIDX_APPCOMPAT)
    implementation(SupportLibs.ANDROIDX_CONSTRAINT_LAYOUT)
    implementation(SupportLibs.ANDROIDX_CORE_KTX)
    implementation (GoogleLibs.ANDROID_MATERIAL)

    testImplementation(Testing.KOTEST_RUNNER)
    testImplementation(Testing.KOTEST_JUNIT_RUNNER)
    testImplementation(Testing.KOTEST_ASSERTIONS)
    testImplementation(Testing.KOTEST_PROPERTIES)
    testImplementation(Testing.MOCKK)
    testImplementation(Testing.KOTLINX_COROUTINES_TEST)

    androidTestImplementation(AndroidTesting.ANDROIDX_TEST_RUNNER)
    androidTestImplementation(AndroidTesting.ANDROIDX_TEST_EXT_JUNIT)
    androidTestImplementation(AndroidTesting.ANDROIDX_TEST_RULES)
    androidTestImplementation(AndroidTesting.ESPRESSO_CORE)
}