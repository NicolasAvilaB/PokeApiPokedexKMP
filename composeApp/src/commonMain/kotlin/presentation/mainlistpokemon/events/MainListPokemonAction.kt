package presentation.mainlistpokemon.events

sealed class MainListPokemonAction {
    data class GetListPokemonAction(val number: Int): MainListPokemonAction()
}