plugins {
    id("convention.android-app")
}

android {
    defaultConfig {
        applicationId = "com.kaspersky.kaspresso.sample_upgrade_tests"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    namespace = "com.kaspersky.kaspresso.upgradesample"
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.multidex)

    androidTestImplementation(projects.kaspresso)
}
