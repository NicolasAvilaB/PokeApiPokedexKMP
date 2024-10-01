package navigation

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import theme.getColorsTheme

@Composable
fun NavController() {
    val navigator = rememberNavigator()
    val navGo = remember(navigator) { NavGo(navigator) }
    val startDestination: String = NavRoutes.MainListPokemonScreen.route

    val colors = getColorsTheme()

    NavHost(
        modifier = Modifier.background(color = colors.background),
        navigator = navigator,
        initialRoute = startDestination
    ) {
        scene(
            route = startDestination,
            content = {
                navMainListPokemon(
                    navGo = navGo,
                    colors = colors
                )
            }
        )
    }
}