package navigation

import moe.tlaster.precompose.navigation.Navigator

class NavGo(
    navigator: Navigator
) {
    val logDetailPokemon: (String) -> Unit = { namePokemon ->
        navigator.navigate(NavRoutes.DetailPokemonScreen(namePokemon).route)
    }

    val popBackStack: () -> Unit = {
        navigator.popBackStack()
    }
}
