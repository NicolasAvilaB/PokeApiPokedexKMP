package navigation

sealed class NavRoutes(var route: String){
    object MainListPokemonScreen: NavRoutes("/mainListPokemonScreen")
    data class DetailPokemonScreen(
        val namePokemon: String
    ): NavRoutes("/detailPokemonScreen/${namePokemon}")
}