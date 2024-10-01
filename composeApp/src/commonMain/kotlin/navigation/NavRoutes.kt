package navigation

sealed class NavRoutes(var route: String){
    object MainListPokemonScreen: NavRoutes("/mainListPokemonScreen")
}