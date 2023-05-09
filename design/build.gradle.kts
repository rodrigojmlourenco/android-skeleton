plugins {
    id("procrastination.android.library")
    id("procrastination.android.hilt")
}

android.namespace = "io.procrastination.design"

android {
    dataBinding.enable = true
}

dependencies {
    implementation(libs.picasso)
    implementation(libs.google.materialDesign)
    implementation(libs.timber)
    implementation(libs.rxjava2.java)
    implementation(libs.rxjava2.kotlin)
    implementation(libs.rxjava2.android)
}

