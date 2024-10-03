package ui.mainlistpokemonscreen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    "Pokemon Lista"
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = colors.background,
                    titleContentColor = colors.textColor,
                )
            )
        }
    ) { paddingValues ->
        ListPokemonContent(
            uiState = uiState,
            intentHandler = intentHandler,
            navGo = navGo,
            paddingValues = paddingValues
        )
    }
}

@Composable
fun ListPokemonContent(
    uiState: MainListPokemonUIState,
    intentHandler: MainListPokemonIntentHandler,
    navGo: NavGo,
    paddingValues: PaddingValues
) {
    val number = remember { mutableStateOf(0) }

    when (val currentState = uiState){
        is MainListPokemonUIState.DisplayListPokemonUiState -> {
            MainListPokemonState(
                listPokemonItems = currentState.listPokemon,
                intentHandler = intentHandler,
                navGo = navGo,
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
