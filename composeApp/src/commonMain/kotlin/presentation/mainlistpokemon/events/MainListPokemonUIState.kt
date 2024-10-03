package presentation.mainlistpokemon.events

import data.models.listpokemon.RemoteListPokemon

sealed class MainListPokemonUIState {
    object LoadingUiState : MainListPokemonUIState()
    data class DisplayListPokemonUiState(
        val listPokemon: RemoteListPokemon,
    ) : MainListPokemonUIState()
    data class ErrorUiState(val error: Throwable): MainListPokemonUIState()
}