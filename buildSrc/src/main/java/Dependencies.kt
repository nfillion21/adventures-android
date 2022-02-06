/**
 * To define dependencies
 */
object Dependencies {

    // Core Android
    val coreAndroidX by lazy {"androidx.core:core-ktx:${Versions.coreAndroidX}"}

    // Compose
    val uiCompose by lazy { "androidx.compose.ui:ui:${Versions.composeVersion}" }
    val materialCompose by lazy { "androidx.compose.material:material:${Versions.composeVersion}" }
    val uiToolingPreviewCompose by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}" }
    val uiTestJUnit4Compose by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}" }
    val uiToolingCompose by lazy { "androidx.compose.ui:ui-tooling:${Versions.composeVersion}" }

    val lifeCycleRuntimeAndroidX by lazy {"androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycleRuntinAndroidX}"}

    // Activity Compose
    val activityCompose by lazy {"androidx.activity:activity-compose:${Versions.activityCompose}"}

    // Tests
    val junit by lazy {"junit:junit:${Versions.junit}"}
    val junitAndroidX by lazy {"androidx.test.ext:junit:1.1.3:${Versions.junitAndroidX}"}
    val expressoAndroidX by lazy {"androidx.test.espresso:espresso-core:${Versions.expressoAndroidX}"}

    // Hilt
    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hiltVersion}" }
    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hiltVersion}" }

    // Room
    val roomRuntine by lazy {"androidx.room:room-runtime:${Versions.roomVersion}"}
    //implementation("androidx.room:room-runtime:$roomVersion")
    val roomCompiler by lazy {"androidx.room:room-compiler:${Versions.roomVersion}"}

    //annotationProcessor("androidx.room:room-compiler:$roomVersion")

    // To use Kotlin annotation processing tool (kapt)
    //kapt("androidx.room:room-compiler:$roomVersion")
    // To use Kotlin Symbolic Processing (KSP)
    //ksp("androidx.room:room-compiler:$roomVersion")

    object Room {
        private const val version = "2.3.0"
        const val room = "androidx.room:room-ktx:$version"
        const val roomCompiler = "androidx.room:room-compiler:$version"
        const val roomTesting = "androidx.room:room-testing:$version"
    }
}
