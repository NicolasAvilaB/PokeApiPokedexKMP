package navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import com.pokemon.ui.pokeapipokedex.presentation.detailpokemon.DetailPokemonViewModel
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.DetailPokemonIntentHandler
import com.pokemon.ui.pokeapipokedex.ui.detailpokemon.DetailPokemonScreen
import mediaplayer.MediaPlayerController
import moe.tlaster.precompose.flow.collectAsStateWithLifecycle
import moe.tlaster.precompose.navigation.BackStackEntry
import moe.tlaster.precompose.navigation.path
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


@Composable
internal fun navDetailPokemon(
    viewModel: DetailPokemonViewModel,
    intentHandler: DetailPokemonIntentHandler,
    navGo: NavGo,
    colors: DarkModeColors,
    backStackEntry: BackStackEntry,
    mediaPlayerController: MediaPlayerController,
) {
    val namePokemon = backStackEntry.path<String>("namePokemon")
    LaunchedEffect(key1 = viewModel) {
        viewModel.processUserIntentDetailPokemon(
            intentHandler.detailPokemonUIntents(namePokemon.toString())
        )
    }

    val detailPokemonIntentHandler = intentHandler.apply {
        coroutineScope = rememberCoroutineScope()
    }

    val uiState = remember { viewModel.detailViewPokemonState() }
        .collectAsStateWithLifecycle(
            initial = viewModel.loadingUiState
        ).value

    DetailPokemonScreen(
        intentHandler = detailPokemonIntentHandler,
        namePokemon = namePokemon.toString(),
        mediaPlayerController = mediaPlayerController,
        uiState = uiState,
        navGo = navGo,
        colors = colors
    )

}