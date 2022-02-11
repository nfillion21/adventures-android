package pgm.poolp.adventures
import android.app.Application
import coil.ImageLoader
import coil.annotation.ExperimentalCoilApi
import dagger.hilt.android.HiltAndroidApp
import pgm.poolp.adventures.ui.UnsplashSizingInterceptor

import coil.ImageLoaderFactory
import coil.compose.rememberImagePainter

@HiltAndroidApp
class AdventuresApplication : Application(), ImageLoaderFactory {

    /**
     * Create the singleton [ImageLoader].
     * This is used by [rememberImagePainter] to load images in the app.
     */
    @OptIn(ExperimentalCoilApi::class)
    override fun newImageLoader(): ImageLoader {
        return ImageLoader.Builder(this)
            .componentRegistry {
                add(UnsplashSizingInterceptor)
            }
            .build()
    }
}
