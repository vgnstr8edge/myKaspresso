plugins {
    id("convention.android-app")
}

android {
    defaultConfig {
        applicationId = "com.kaspersky.kaspresso.tutorial"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunnerArguments["clearPackageData"] = "true"
    }

    testOptions {
        execution = "ANDROIDX_TEST_ORCHESTRATOR"
    }
    namespace = "com.kaspersky.kaspresso.tutorial"
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("com.google.android.material:material:1.6.1")

    androidTestImplementation("com.kaspersky.android-components:kaspresso:1.4.1") // TODO Update to new release to fix screenshots path
    androidTestImplementation("androidx.test.ext:junit-ktx:1.1.3")

    androidTestUtil("androidx.test:orchestrator:1.4.1")
}
