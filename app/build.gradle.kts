plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.androidlab"
    compileSdk {
        // 앱을 컴파일하거나 빌드할 때 적용할 버전
        version = release(36)
    }

    defaultConfig {
        //  고유한 문자열로 지정해야 함
        applicationId = "com.example.androidlab"
        //  이 앱을 설치할 수 있는 기기의 최소 SDK 버전
        minSdk = 24
        //  개발할 때 적용되는 SDK 버전
        targetSdk = 36
        //  앱의 버전, 업데이트될 때 이 버전을 올려 다시 배포
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        //  개발 언어의 버전을 설정(생략시 기본으로 1.6 적용)
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    //  앱에서 이용하는 라이브버리의 버전
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}