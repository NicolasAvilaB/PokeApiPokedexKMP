package com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.spritelistgeneration

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.RemoteListDetailPokemon
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.text.PokemonText18
import imagesview.ImagesViewController

@Composable
fun ListGeneration7(
    detailPokemon: RemoteListDetailPokemon,
    paddingText: Dp,
    imagesViewController: ImagesViewController
) {
    val generation = detailPokemon.sprites?.versions?.generationvii
    fun matchUrlPokemon(): List<String?> {
        return listOf(
            generation?.ultrasunultramoon?.frontdefault,
            generation?.ultrasunultramoon?.frontfemale,
            generation?.ultrasunultramoon?.frontshiny,
            generation?.ultrasunultramoon?.frontshinyfemale,
            generation?.icons?.frontdefault,
            generation?.icons?.frontfemale
        )
    }
    if (generation?.ultrasunultramoon?.frontdefault != null){
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingText)
        ) {
            PokemonText18(
                text = "Sprites de ${detailPokemon.name?.capitalize()} - 7° Gen (USUM)",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(paddingText)
            )
            LazyRow(
                modifier = Modifier
                    .height(150.dp)
                    .padding(paddingText)
            ) {
                matchUrlPokemon().forEach { url ->
                    url?.let { result ->
                        item {
                            imagesViewController.headerImage(result)
                        }
                    }
                }
            }
        }
    }
}
