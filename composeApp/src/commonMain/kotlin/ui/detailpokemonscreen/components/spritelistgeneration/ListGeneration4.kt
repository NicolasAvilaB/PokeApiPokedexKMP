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
fun ListGeneration4(
    detailPokemon: RemoteListDetailPokemon,
    paddingText: Dp,
    imagesViewController: ImagesViewController
) {
    val generation = detailPokemon.sprites?.versions?.generationiv
    fun matchUrlPokemon(): List<String?> {
        return listOf(
            generation?.diamondpearl?.backdefault,
            generation?.diamondpearl?.backfemale,
            generation?.diamondpearl?.backshiny,
            generation?.diamondpearl?.backshinyfemale,
            generation?.diamondpearl?.frontdefault,
            generation?.diamondpearl?.frontfemale,
            generation?.diamondpearl?.frontshiny,
            generation?.diamondpearl?.frontshinyfemale,
            generation?.heartgoldsoulsilver?.backdefault,
            generation?.heartgoldsoulsilver?.backfemale,
            generation?.heartgoldsoulsilver?.backshiny,
            generation?.heartgoldsoulsilver?.backshinyfemale,
            generation?.heartgoldsoulsilver?.frontdefault,
            generation?.heartgoldsoulsilver?.frontfemale,
            generation?.heartgoldsoulsilver?.frontshiny,
            generation?.heartgoldsoulsilver?.frontshinyfemale,
            generation?.platinum?.backdefault,
            generation?.platinum?.backfemale,
            generation?.platinum?.backshiny,
            generation?.platinum?.backshinyfemale,
            generation?.platinum?.frontdefault,
            generation?.platinum?.frontfemale,
            generation?.platinum?.frontshiny,
            generation?.platinum?.frontshinyfemale,
        )
    }
    if (generation?.diamondpearl?.backdefault != null) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingText)
        ) {
            PokemonText18(
                text = "Sprites de ${detailPokemon.name?.capitalize()} - 4° Gen (DPP-HGSS)",
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
