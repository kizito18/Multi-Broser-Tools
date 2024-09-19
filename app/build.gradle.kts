plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)

    //Proto data store
    id ("org.jetbrains.kotlin.plugin.serialization")
    alias(libs.plugins.google.gms.google.services)

    //applovin
    id("applovin-quality-service")

}




android {
    namespace = "com.my.Zitos.MultiBroser.Tools"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.my.Zitos.MultiBroser.Tools"
        minSdk = 21
        targetSdk = 34
        versionCode = 26
        versionName = "6.6"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            isShrinkResources = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.appcompat)
    implementation(libs.firebase.firestore)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)



    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.7.0")

    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")






    //Proto data store
    implementation ("androidx.datastore:datastore:1.1.1")
    implementation ("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.5")
    implementation ("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")


    //  SystemUiController example for changing status Bar color
   implementation ("com.google.accompanist:accompanist-systemuicontroller:0.18.0")


    // Coli
    implementation ("io.coil-kt:coil-compose:2.4.0")






    // play billing
    implementation("com.android.billingclient:billing:7.0.0")



    //for GDPR Admob
    implementation("com.google.android.ump:user-messaging-platform:3.0.0")


    //admob
    implementation("com.google.android.gms:play-services-ads:23.3.0")

    // applovin
    implementation("com.applovin:applovin-sdk:12.6.1")


}


// Add the applovin block at the bottom
applovin {
    apiKey = "0loixKmIHs1pVCe0298DL5o9z_iXWGc4VGwNKvwxWhAtuKQmDcacVBN8iDCGE5uXgmgQWZw-3MuFqbwraeb14h"
}