package navigation

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import moe.tlaster.precompose.koin.koinViewModel
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import org.koin.core.parameter.parametersOf
import presentation.mainlistpokemon.MainListPokemonViewModel
import theme.getColorsTheme
import ui.mainlistpokemonscreen.MainListPokemonIntentHandler

@Composable
fun NavController() {
    val navigator = rememberNavigator()
    val navGo = remember(navigator) { NavGo(navigator) }
    val startDestination: String = NavRoutes.MainListPokemonScreen.route

    val colors = getColorsTheme()

    val viewModel = koinViewModel(MainListPokemonViewModel::class) { parametersOf()}
    val intentHandler = remember { MainListPokemonIntentHandler() }

    NavHost(
        modifier = Modifier.background(color = colors.background),
        navigator = navigator,
        initialRoute = startDestination
    ) {
        scene(
            route = startDestination,
            content = {
                navMainListPokemon(
                    viewModel = viewModel,
                    intentHandler = intentHandler,
                    navGo = navGo,
                    colors = colors
                )
            }
        )
    }
}