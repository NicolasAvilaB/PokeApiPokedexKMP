package ui.mainlistpokemonscreen.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import theme.DarkModeColors

@Composable
fun LoadingView(
    colors: DarkModeColors
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colors.background),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            color = colors.purple
        )
    }
}