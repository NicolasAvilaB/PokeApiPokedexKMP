package imagesview

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

actual class ImagesViewController actual constructor() {

    @Composable
    actual fun headerImage(image: String) {
        AsyncImage(
            model = image,
            contentDescription = null,
            modifier = Modifier
                .width(150.dp)
                .fillMaxHeight(0.83f)
                .clip(MaterialTheme.shapes.small),
            contentScale = Crop
        )
    }
}

