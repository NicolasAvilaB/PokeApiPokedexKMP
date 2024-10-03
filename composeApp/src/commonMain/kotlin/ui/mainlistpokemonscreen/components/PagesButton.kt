package ui.mainlistpokemonscreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import data.models.listpokemon.RemoteListPokemon
import ui.mainlistpokemonscreen.MainListPokemonIntentHandler

@Composable
fun PagesButton(
    listPokemonItems: RemoteListPokemon,
    intentHandler: MainListPokemonIntentHandler,
    number: MutableState<Int>,
) {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(
            modifier = Modifier.weight(1f).fillMaxHeight(),
            enabled = number.value != 0,
            onClick = {
                kotlin.runCatching {
                    number.value -= 20
                    intentHandler.pagesPokemon(number = number.value)
                }.onFailure { e ->
                    e.printStackTrace()
                }
            },
        ) {
            Text(
                "Volver"
            )
        }
        Button(
            modifier = Modifier.weight(1f).fillMaxHeight(),
            enabled = number.value + 20 <= listPokemonItems.count!!,
            onClick = {
                kotlin.runCatching {
                    number.value += 20
                    intentHandler.pagesPokemon(number = number.value)
                }.onFailure { e ->
                    e.printStackTrace()
                }
            },
        ) {
            Text(
                "Siguiente"
            )
        }
    }
}