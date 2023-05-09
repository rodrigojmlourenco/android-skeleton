plugins {
    id("procrastination.application")
    id("procrastination.android.hilt")
    id("kotlin-kapt")

    id("androidx.navigation.safeargs.kotlin")
}


android {
    namespace = "io.procrastination.skeleton"

    defaultConfig {
        applicationId = "io.procrastination.skeleton"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {

        debug {
            applicationIdSuffix = ".debug"
        }
        val release by getting {
            isMinifyEnabled = true

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures.buildConfig = true
}

dependencies {
    implementation(project(":design"))

    implementation(libs.retrofit.kotlin.serialization)
    implementation(libs.retrofit.rxjava)
    implementation(libs.retrofit.moshi)
    implementation(libs.retrofit.core)
    implementation(libs.okhttp.logging)
    implementation(libs.timber)
    implementation(libs.moshi.core)
    implementation(libs.moshi.adapters)
    implementation(libs.moshi.kotlin)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.rxjava2.android)
}

