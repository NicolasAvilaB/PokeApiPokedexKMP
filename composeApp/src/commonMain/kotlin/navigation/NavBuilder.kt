package navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import moe.tlaster.precompose.flow.collectAsStateWithLifecycle
import presentation.mainlistpokemon.MainListPokemonViewModel
import theme.DarkModeColors
import ui.mainlistpokemonscreen.MainListPokemonIntentHandler
import ui.mainlistpokemonscreen.MainListPokemonScreen

@Composable
internal fun navMainListPokemon(
    viewModel: MainListPokemonViewModel,
    intentHandler: MainListPokemonIntentHandler,
    navGo: NavGo,
    colors: DarkModeColors,
) {
    LaunchedEffect(key1 = viewModel) {
        viewModel.processUserIntentsAndObserveUiStates(intentHandler.pokemonUIntents())
    }
    val listPokemonIntentHandler = intentHandler.apply {
        coroutineScope = rememberCoroutineScope()
    }

    val uiState = remember { viewModel.pokemonState() }
        .collectAsStateWithLifecycle(
            initial = viewModel.loadingUiState
        ).value

    MainListPokemonScreen(
        intentHandler = listPokemonIntentHandler,
        uiState = uiState,
        navGo = navGo,
        colors = colors
    )
}