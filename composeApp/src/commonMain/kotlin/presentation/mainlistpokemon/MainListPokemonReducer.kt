package presentation.mainlistpokemon

import presentation.mainlistpokemon.MainListPokemonResult.GetListPokemonResult.Error
import presentation.mainlistpokemon.MainListPokemonResult.GetListPokemonResult.InProgress
import presentation.mainlistpokemon.MainListPokemonResult.GetListPokemonResult.Success
import presentation.mainlistpokemon.events.MainListPokemonUIState
import presentation.mainlistpokemon.events.MainListPokemonUIState.DisplayListPokemonUiState
import presentation.mainlistpokemon.events.MainListPokemonUIState.ErrorUiState
import presentation.mainlistpokemon.events.MainListPokemonUIState.LoadingUiState

class MainListPokemonReducer(){

    private fun unsupportedReduceCase() = RuntimeException()

    infix fun MainListPokemonUIState.reduceWith(result: MainListPokemonResult): MainListPokemonUIState {
        return when (val previousState = this) {
            is ErrorUiState -> previousState reduceWith result
            is DisplayListPokemonUiState -> previousState reduceWith result
            is LoadingUiState -> previousState reduceWith result
        }
    }

    private infix fun LoadingUiState.reduceWith(result: MainListPokemonResult) = when (result) {
        is Error -> ErrorUiState(result.error)
        is Success -> DisplayListPokemonUiState(result.listPokemon)
        is InProgress -> LoadingUiState
        else -> throw unsupportedReduceCase()
    }

    private infix fun ErrorUiState.reduceWith(result: MainListPokemonResult) = when (result) {
        is InProgress -> LoadingUiState
        else -> throw unsupportedReduceCase()
    }

    private infix fun DisplayListPokemonUiState.reduceWith(result: MainListPokemonResult) = when (result) {
        is InProgress -> LoadingUiState
        else -> throw unsupportedReduceCase()
    }

}