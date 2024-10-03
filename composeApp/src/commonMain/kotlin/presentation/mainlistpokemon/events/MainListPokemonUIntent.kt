package presentation.mainlistpokemon.events

sealed class MainListPokemonUIntent {
    data class GetListPokemonUIntent(val number: Int) : MainListPokemonUIntent()
    data class RetryIntent(val number: Int) : MainListPokemonUIntent()
}