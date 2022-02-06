plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    //ConfigData.compileSdkVersion
    compileSdkVersion(ConfigData.compileSdkVersion)

    defaultConfig {
        applicationId = "pgm.poolp.adventures"
        /*
        minSdk ConfigData.minSdkVersion
        targetSdk ConfigData.targetSdkVersion
        versionCode ConfigData.versionCode
        versionName ConfigData.versionName
        */
        minSdkVersion(ConfigData.minSdkVersion)
        targetSdkVersion(ConfigData.targetSdkVersion)
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }

    buildFeatures {
        compose = true
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.1"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Deps.coreAndroidX)

    implementation(Deps.uiCompose)
    implementation (Deps.materialCompose)
    implementation (Deps.uiToolingPreviewCompose)
    androidTestImplementation (Deps.uiTestJUnit4Compose)
    debugImplementation (Deps.uiToolingCompose)

    implementation (Deps.lifeCycleRuntimeAndroidX)
    implementation (Deps.activityCompose)
    testImplementation (Deps.junit)

    androidTestImplementation (Deps.junitAndroidX)
    debugImplementation (Deps.expressoAndroidX)
}