package ui.mainlistpokemonscreen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListSelectItem(name: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .clickable(onClick = onClick)
            .padding(paddingRow)
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = name.capitalize(),
            fontSize = 20.sp,
        )
    }
    HorizontalDivider(
        modifier = Modifier.padding(
            start = 16.dp,
            end = 16.dp
        )
    )
}

private val paddingRow = 16.dp