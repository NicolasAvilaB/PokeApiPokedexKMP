package ui.mainlistpokemonscreen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.TopAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import navigation.NavGo
import presentation.mainlistpokemon.events.MainListPokemonUIState
import theme.DarkModeColors
import ui.mainlistpokemonscreen.views.ErrorState
import ui.mainlistpokemonscreen.views.LoadingState
import ui.mainlistpokemonscreen.views.MainListPokemonState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainListPokemonScreen(
    uiState: MainListPokemonUIState,
    intentHandler: MainListPokemonIntentHandler,
    navGo: NavGo,
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
                elevation = 0.dp,
            )
        },
    ) { paddingValues ->
        ListPokemonContent(
            uiState = uiState,
            intentHandler = intentHandler,
            navGo = navGo,
            colors = colors,
            paddingValues = paddingValues
        )
    }
}

@Composable
fun ListPokemonContent(
    uiState: MainListPokemonUIState,
    intentHandler: MainListPokemonIntentHandler,
    navGo: NavGo,
    paddingValues: PaddingValues,
    colors: DarkModeColors
) {
    val number = remember { mutableStateOf(0) }

    when (val currentState = uiState){
        is MainListPokemonUIState.DisplayListPokemonUiState -> {
            MainListPokemonState(
                listPokemonItems = currentState.listPokemon,
                intentHandler = intentHandler,
                navGo = navGo,
                colors = colors,
                number = number,
                paddingValues = paddingValues
            )
        }
        is MainListPokemonUIState.ErrorUiState -> {
            ErrorState(intentHandler = intentHandler, number = number)
        }
        MainListPokemonUIState.LoadingUiState -> {
            LoadingState()
        }
    }
}
