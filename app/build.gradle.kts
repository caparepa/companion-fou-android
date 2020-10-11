plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.3")

    defaultConfig {
        applicationId = "com.caparepa.companionfou"
        minSdkVersion(26)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "0.1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        signingConfig = signingConfigs.getByName("debug")

        //Room configuration
        val annotationArguments = HashMap<String, String>()
        annotationArguments["room.schemaLocation"] = "$projectDir/schemas"
        annotationArguments["room.incremental"] = "true"
        annotationArguments["room.expandProjection"] = "true"

        javaCompileOptions {
            annotationProcessorOptions {
                arguments = annotationArguments
            }
        }

    }

    buildTypes {
        getByName("debug") {
            val baseUrl = findProperty("BASE_NGROK_URL")
            buildConfigField("String", "BASE_URL", "\"http://$baseUrl/storage/files/data/\"")
            applicationIdSuffix = ".debug"
        }

        create("stage") {
            signingConfigs.getByName("debug")
            val baseUrl = findProperty("BASE_NGROK_URL")

            buildConfigField("String", "BASE_URL", "\"http://$baseUrl/storage/files/data/\"")
            applicationIdSuffix = ".stage"
            isDebuggable = true
        }

        /*getByName("release") {
            signingConfigs.getByName("release")
            buildConfigField("String", "BASE_URL", "\"https://staging.suggestic.com/api/v1/\"")
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }*/

    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {
    //Core dependencies
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.0")
    implementation("androidx.core:core-ktx:1.3.1")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.8")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.8")

    //layouts
    implementation("androidx.constraintlayout:constraintlayout:2.0.1")

    //navigation components
    implementation("androidx.navigation:navigation-fragment-ktx:2.3.0")
    implementation("androidx.navigation:navigation-ui-ktx:2.3.0")

    //viewpager2
    implementation("androidx.viewpager2:viewpager2:1.0.0")
    implementation("com.google.android.material:material:1.3.0-alpha02")
}

dependencies {
    //Test dependencies
    testImplementation("junit:junit:4.13")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
}

dependencies {
    //Third-party dependencies

    //OKHTTP
    implementation("com.squareup.okhttp3:okhttp:4.5.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.5.0")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.7.0")
    implementation("com.squareup.retrofit2:converter-gson:2.7.0")
    implementation("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2")

    //threeten
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.4")

    //Dependency injection
    implementation("org.koin:koin-android:2.0.1")
    implementation("org.koin:koin-androidx-scope:2.0.1")
    implementation("org.koin:koin-androidx-viewmodel:2.0.1")

    //room
    implementation("androidx.room:room-ktx:2.2.5")
    kapt("androidx.room:room-compiler:2.2.5")

    //model mapper
    implementation("org.modelmapper:modelmapper:2.3.3")

    //threeten
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.4")

    //Chrome tabs
    implementation("androidx.browser:browser:1.2.0")
    implementation("com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava")

    //GLIDE
    implementation("com.github.bumptech.glide:glide:4.10.0")
    kapt("com.github.bumptech.glide:compiler:4.10.0")

    //loading
    implementation("com.github.ybq:Android-SpinKit:1.4.0")

    //multiview adapter
    implementation("dev.ahamed.mva2:adapter:2.0.0")
    implementation("dev.ahamed.mva2:ext-databinding:2.0.0")  // DataBinding
    implementation("dev.ahamed.mva2:ext-decorator:2.0.0")    // Decorators
    implementation("dev.ahamed.mva2:ext-diffutil-rx:2.0.0")  // RxDiffUtil

}