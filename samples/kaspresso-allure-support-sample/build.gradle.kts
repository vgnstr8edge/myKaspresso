plugins {
    id("convention.android-app")
}

android {
    defaultConfig {
        applicationId = "com.kaspersky.kaspresso.alluresupport.sample"
        // AllureAndroidJUnitRunner must be used as testInstrumentationRunner
        testInstrumentationRunner = "io.qameta.allure.android.runners.AllureAndroidJUnitRunner"
        testInstrumentationRunnerArguments["clearPackageData"] = "true"
    }

    testOptions {
        execution = "ANDROIDX_TEST_ORCHESTRATOR"
    }
    namespace = "com.kaspersky.kaspresso.alluresupport.sample"
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraint)
    implementation(libs.multidex)

    androidTestImplementation(projects.kaspresso)
    androidTestImplementation(projects.allureSupport)

    androidTestImplementation(libs.androidXTestExtJunitKtx)
    androidTestImplementation(libs.androidXTestExtJunit)
    androidTestImplementation(libs.junit)

    androidTestUtil(libs.androidXTestOrchestrator)
}
