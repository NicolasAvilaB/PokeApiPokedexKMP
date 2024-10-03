package ui.mainlistpokemonscreen.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import ui.mainlistpokemonscreen.MainListPokemonIntentHandler

@Composable
fun ErrorState(
    intentHandler: MainListPokemonIntentHandler,
    number: MutableState<Int>
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Ups, a habido un problema",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(24.dp),
            )
            Button(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red
                ),
                onClick = {
                    number.value = 0
                    intentHandler.retryIntent(number = number.value)
                }
            ) {
                Text("Reintentar")
            }
        }
    }
}