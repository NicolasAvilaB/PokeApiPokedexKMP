package imagesview

import androidx.compose.runtime.Composable

expect class ImagesViewController() {
    @Composable
    fun headerImage (image: String)
}