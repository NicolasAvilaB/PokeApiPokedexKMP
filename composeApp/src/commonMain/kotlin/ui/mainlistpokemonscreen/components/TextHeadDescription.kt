package ui.mainlistpokemonscreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.models.listpokemon.RemoteListPokemon
import theme.DarkModeColors

@Composable
fun TextHeadDescription(
    listPokemonItems: RemoteListPokemon,
    number: MutableState<Int>,
    colors: DarkModeColors
) {
    Column(
        modifier = Modifier
            .padding(5.dp)
            .clip(shape = RoundedCornerShape(30))
            .background(colors.redHead)
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp),
            color = Color.White,
            text = "Total: " + " ${listPokemonItems.count}",
            fontSize = 20.sp,
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, bottom = 16.dp),
            color = Color.White,
            text = "Desde: " + " ${number.value} " + "Hasta: " + " ${number.value + 20}"
        )
    }
}