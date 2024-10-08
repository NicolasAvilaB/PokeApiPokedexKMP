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
fun ListGeneration1(
    detailPokemon: RemoteListDetailPokemon,
    paddingText: Dp,
    imagesViewController: ImagesViewController
) {
    val generation = detailPokemon.sprites?.versions?.generationi
    fun matchUrlPokemon(): List<String?> {
        return listOf(
            generation?.redblue?.backdefault,
            generation?.redblue?.backgray,
            generation?.redblue?.backtransparent,
            generation?.redblue?.frontdefault,
            generation?.redblue?.frontgray,
            generation?.redblue?.fronttransparent,
            generation?.yellow?.backdefault,
            generation?.yellow?.backgray,
            generation?.yellow?.backtransparent,
            generation?.yellow?.frontdefault,
            generation?.yellow?.frontgray,
            generation?.yellow?.fronttransparent
        )
    }
    if (generation?.redblue?.backdefault != null) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingText)
        ) {
            PokemonText18(
                text = "Sprites de ${detailPokemon.name?.capitalize()} - 1° Gen (RBY)",
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
