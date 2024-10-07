package com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.RemoteListDetailPokemon
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.text.PokemonText16
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.launch
import mediaplayer.MediaPlayerController

@Composable
fun CrieSoundLegacy(
    mediaPlayerController: MediaPlayerController,
    detailPokemon: RemoteListDetailPokemon,
    paddingText: Dp
){
    Button(
        onClick = {
            CoroutineScope(Dispatchers.IO).launch {
                val soundLatest = detailPokemon.cries?.legacy
                mediaPlayerController.playSound(soundLatest.toString())
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = paddingText,
                end = paddingText
            )
    ) {
        PokemonText16(text ="Grito Antiguo")
    }
}