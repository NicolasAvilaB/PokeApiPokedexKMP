package ui.mainlistpokemonscreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.models.listpokemon.RemoteListPokemon
import theme.DarkModeColors
import ui.mainlistpokemonscreen.MainListPokemonIntentHandler

@Composable
fun PagesButton(
    listPokemonItems: RemoteListPokemon,
    intentHandler: MainListPokemonIntentHandler,
    number: MutableState<Int>,
    colors: DarkModeColors,
) {
    Row(
        modifier = Modifier.fillMaxSize().padding(2.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Button(
            modifier = Modifier.weight(1f).fillMaxHeight(),
            colors = ButtonDefaults.buttonColors(
                containerColor = colors.purple
            ),
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
            Text(text = "<- Volver",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = colors.textColor)
        }
        Button(
            modifier = Modifier.weight(1f).fillMaxHeight(),
            colors = ButtonDefaults.buttonColors(
                containerColor = colors.purple
            ),
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
                text ="Siguiente ->",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = colors.textColor
            )
        }
    }
}