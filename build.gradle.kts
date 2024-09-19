



buildscript {

    repositories {
        //applovin
        maven { url = uri("https://artifacts.applovin.com/android") }
    }

    dependencies {
        //Proto data store
        classpath ("org.jetbrains.kotlin:kotlin-serialization:1.6.10")

        // applovin
        classpath ("com.applovin.quality:AppLovinQualityServiceGradlePlugin:+")
    }
}








// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.google.gms.google.services) apply false
}