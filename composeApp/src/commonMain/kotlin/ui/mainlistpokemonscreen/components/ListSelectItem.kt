package ui.mainlistpokemonscreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import theme.DarkModeColors

@Composable
fun ListSelectItem(
    name: String, onClick: () -> Unit,
    colors: DarkModeColors
) {
    Row(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(35))
            .background(colors.blueSea)
            .clickable(onClick = onClick)
            .padding(paddingRow)
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            color = colors.textColor,
            text = name.capitalize(),
            fontSize = 20.sp,
        )
    }
    HorizontalDivider(
        modifier = Modifier.padding(
            start = 16.dp,
            end = 16.dp,
            top = 4.dp,
            bottom = 4.dp
        ),
        color = Color.Gray
    )
}

private val paddingRow = 16.dp