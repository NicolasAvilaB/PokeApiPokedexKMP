package navigation

import androidx.compose.runtime.Composable
import theme.DarkModeColors
import ui.mainlistpokemon.MainListPokemonScreen

@Composable
internal fun navMainListPokemon(
    navGo: NavGo,
    colors: DarkModeColors,
) {
    MainListPokemonScreen(
        navGo = navGo,
        colors = colors
    )
}