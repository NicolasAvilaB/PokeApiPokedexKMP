package com.pokemon.ui.pokeapipokedex.ui.detailpokemon.viewstate

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.RemoteListDetailPokemon
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.AttacksLearn
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.DataPokemon
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.GameIndex
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.HeaderAbility
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.HeaderImage
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.StatsBase
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.TypeTable
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.spritelistgeneration.ListGeneration1
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.spritelistgeneration.ListGeneration2
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.spritelistgeneration.ListGeneration3
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.spritelistgeneration.ListGeneration4
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.spritelistgeneration.ListGeneration5
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.spritelistgeneration.ListGeneration6
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.spritelistgeneration.ListGeneration7
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.components.spritelistgeneration.ListGeneration8
import imagesview.ImagesViewController
import mediaplayer.MediaPlayerController

@Composable
fun DetailPokemonState(
    detailPokemon: RemoteListDetailPokemon,
    paddingValues: PaddingValues,
    mediaPlayerController: MediaPlayerController,
    imagesViewController: ImagesViewController
) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .verticalScroll(scrollState)
            .fillMaxSize()

    ) {
        Row(modifier = Modifier.height(260.dp)) {
            HeaderImage(
                imagesViewController = imagesViewController,
                detailPokemon = detailPokemon,
                paddingText = paddingText
            )
            HeaderAbility(
                mediaPlayerController = mediaPlayerController,
                detailPokemon = detailPokemon,
                paddingText = paddingText
            )

        }
        Row(modifier = Modifier.height(310.dp)) {
            GameIndex(
                detailPokemon = detailPokemon,
                paddingText = paddingText
            )
            Column {
                DataPokemon(
                    detailPokemon = detailPokemon,
                    paddingText = paddingText
                )
                TypeTable(
                    detailPokemon = detailPokemon,
                    paddingText = paddingText
                )
            }
        }
        Row(
            modifier = Modifier.height(200.dp)
        ) {
            StatsBase(
                detailPokemon = detailPokemon,
                paddingText = paddingText
            )
            AttacksLearn(
                detailPokemon = detailPokemon,
                paddingText = paddingText
            )
        }
        ListGeneration1(
            imagesViewController = imagesViewController,
            detailPokemon = detailPokemon,
            paddingText = paddingText
        )
        ListGeneration2(
            imagesViewController = imagesViewController,
            detailPokemon = detailPokemon,
            paddingText = paddingText
        )
        ListGeneration3(
            imagesViewController = imagesViewController,
            detailPokemon = detailPokemon,
            paddingText = paddingText
        )
        ListGeneration4(
            imagesViewController = imagesViewController,
            detailPokemon = detailPokemon,
            paddingText = paddingText
        )
        ListGeneration5(
            imagesViewController = imagesViewController,
            detailPokemon = detailPokemon,
            paddingText = paddingText
        )
        ListGeneration6(
            imagesViewController = imagesViewController,
            detailPokemon = detailPokemon,
            paddingText = paddingText
        )
        ListGeneration7(
            imagesViewController = imagesViewController,
            detailPokemon = detailPokemon,
            paddingText = paddingText
        )
        ListGeneration8(
            imagesViewController = imagesViewController,
            detailPokemon = detailPokemon,
            paddingText = paddingText
        )
    }
}

private val paddingText = 6.dp