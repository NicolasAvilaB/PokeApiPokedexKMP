package ui.mainlistpokemonscreen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.models.listpokemon.RemoteListPokemon

@Composable
fun TextHeadDescription(listPokemonItems: RemoteListPokemon, number: MutableState<Int>) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp, start = 16.dp),
        text = "Total: " + " ${listPokemonItems.count}",
        fontSize = 20.sp,
    )
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp),
        text = "Desde: " + " ${number.value} " +
                "Hasta: " + " ${number.value + 20}"
    )
}