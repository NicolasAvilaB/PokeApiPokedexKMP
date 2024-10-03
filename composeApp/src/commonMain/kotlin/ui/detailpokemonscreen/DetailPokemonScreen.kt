package com.pokemon.ui.pokeapipokedex.ui.detailpokemon

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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
import navigation.NavGo
import theme.DarkModeColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailPokemonScreen(
    uiState: DetailPokemonUIState,
    navGo: NavGo,
    intentHandler: DetailPokemonIntentHandler,
    namePokemon: String,
    colors: DarkModeColors
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
                            imageVector = Icons.Filled.ArrowBack,
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
            intentHandler = intentHandler,
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
) {
    when (val currentState = uiState) {
        is DisplayDetailPokemonUiState -> {
            DetailPokemonState(
                detailPokemon = currentState.detailPokemon,
                paddingValues = paddingValues
            )
        }

        is ErrorUiState ->{
            Column(
                modifier = Modifier.padding(paddingValues)
            ) {
                Text(""+currentState.error)
                ErrorState(
                    intentHandler = intentHandler,
                    namePokemon = namePokemon
                )
            }
        }
        LoadingUiState -> LoadingState()
    }
}