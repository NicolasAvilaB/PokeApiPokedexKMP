package com.pokemon.ui.pokeapipokedex.ui.detailpokemon

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pokemon.ui.pokeapipokedex.presentation.detailpokemon.events.DetailPokemonUIState
import com.pokemon.ui.pokeapipokedex.presentation.detailpokemon.events.DetailPokemonUIState.DisplayDetailPokemonUiState
import com.pokemon.ui.pokeapipokedex.presentation.detailpokemon.events.DetailPokemonUIState.ErrorUiState
import com.pokemon.ui.pokeapipokedex.presentation.detailpokemon.events.DetailPokemonUIState.LoadingUiState
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.viewstate.DetailPokemonState
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.viewstate.ErrorState
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.viewstate.LoadingState
import imagesview.ImagesViewController
import mediaplayer.MediaPlayerController
import navigation.NavGo
import theme.DarkModeColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailPokemonScreen(
    uiState: DetailPokemonUIState,
    navGo: NavGo,
    intentHandler: DetailPokemonIntentHandler,
    namePokemon: String,
    colors: DarkModeColors,
    mediaPlayerController: MediaPlayerController,
    imagesViewController: ImagesViewController
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                backgroundColor = colors.background,
                title = {
                    Text(
                        text = "Pokedex - Lista de Pokemons",
                        fontSize = 25.sp,
                        color = colors.textColor
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navGo.popBackStack.invoke() }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Volver",
                            tint = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                },
                elevation = 0.dp,
            )
        },
    ) { paddingValues ->
        DetailPokemonContent(
            imagesViewController = imagesViewController,
            intentHandler = intentHandler,
            mediaPlayerController = mediaPlayerController,
            namePokemon = namePokemon,
            uiState = uiState,
            paddingValues = paddingValues
        )
    }

}

@Composable
fun DetailPokemonContent(
    uiState: DetailPokemonUIState,
    paddingValues: PaddingValues,
    intentHandler: DetailPokemonIntentHandler,
    namePokemon: String,
    mediaPlayerController: MediaPlayerController,
    imagesViewController: ImagesViewController,
) {
    when (val currentState = uiState) {
        is DisplayDetailPokemonUiState -> {
            DetailPokemonState(
                imagesViewController = imagesViewController,
                detailPokemon = currentState.detailPokemon,
                mediaPlayerController= mediaPlayerController,
                paddingValues = paddingValues
            )
        }

        is ErrorUiState ->{
                ErrorState(
                    intentHandler = intentHandler,
                    namePokemon = namePokemon
                )

        }
        LoadingUiState -> LoadingState()
    }
}