/**
 * To define plugins
 */
object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
}

/**
 * To define dependencies
 */
object Deps {
    val coreAndroidX by lazy {"androidx.core:core-ktx:${Versions.coreAndroidX}"}

    val uiCompose by lazy { "androidx.compose.ui:ui:${Versions.composeVersion}" }
    val materialCompose by lazy { "androidx.compose.material:material:${Versions.composeVersion}" }
    val uiToolingPreviewCompose by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}" }
    val uiTestJUnit4Compose by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}" }
    val uiToolingCompose by lazy { "androidx.compose.ui:ui-tooling:${Versions.composeVersion}" }

    val lifeCycleRuntimeAndroidX by lazy {"androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycleRuntinAndroidX}"}
    val activityCompose by lazy {"androidx.activity:activity-compose:${Versions.activityCompose}"}
    val junit by lazy {"junit:junit:${Versions.junit}"}
    val junitAndroidX by lazy {"androidx.test.ext:junit:1.1.3:${Versions.junitAndroidX}"}

    val expressoAndroidX by lazy {"androidx.test.espresso:espresso-core:${Versions.expressoAndroidX}"}
}
