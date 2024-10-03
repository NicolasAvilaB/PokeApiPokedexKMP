package presentation.mainlistpokemon

import moe.tlaster.precompose.viewmodel.ViewModel
import moe.tlaster.precompose.viewmodel.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flatMapMerge
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.scan
import presentation.mainlistpokemon.events.MainListPokemonAction
import presentation.mainlistpokemon.events.MainListPokemonAction.GetListPokemonAction
import presentation.mainlistpokemon.events.MainListPokemonUIState
import presentation.mainlistpokemon.events.MainListPokemonUIntent
import presentation.mainlistpokemon.events.MainListPokemonUIntent.GetListPokemonUIntent
import presentation.mainlistpokemon.events.MainListPokemonUIntent.RetryIntent

class MainListPokemonViewModel(
    private val reducer : MainListPokemonReducer,
    private val processor : MainListPokemonProcessor
): ViewModel() {

    val loadingUiState: MainListPokemonUIState = MainListPokemonUIState.LoadingUiState
    private val listPokemonUiState: MutableSharedFlow<MainListPokemonUIState> =
        MutableSharedFlow(replay = 1)

    fun pokemonState(): Flow<MainListPokemonUIState> =
        listPokemonUiState

    fun processUserIntentsAndObserveUiStates(
        pokemonIntents: Flow<MainListPokemonUIntent>,
        coroutineScope: CoroutineScope = viewModelScope,
    ) {
        pokemonIntents
            .flatMapMerge { pokemonIntent ->
                processor.actionProcessor(pokemonIntent.toAction())
            }
            .scan(loadingUiState) { previousUiState, result ->
                with(reducer) { previousUiState reduceWith result }
            }
            .onEach { pokemonstate ->
                listPokemonUiState.emit(pokemonstate)
            }
            .flowOn(Dispatchers.IO)
            .distinctUntilChanged()
            .catch { e ->
                e.printStackTrace()
            }
            .launchIn(coroutineScope)
    }

    private fun MainListPokemonUIntent.toAction(): MainListPokemonAction {
        return when (this) {
            is RetryIntent -> GetListPokemonAction(this.number)
            is GetListPokemonUIntent -> GetListPokemonAction(this.number)
        }
    }
}