package presentation.mainlistpokemon

import data.PokemonRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import presentation.mainlistpokemon.MainListPokemonResult.GetListPokemonResult
import presentation.mainlistpokemon.events.MainListPokemonAction
import presentation.mainlistpokemon.events.MainListPokemonAction.GetListPokemonAction

class MainListPokemonProcessor (
    private val repository : PokemonRepository
) {
    fun actionProcessor(actions: MainListPokemonAction): Flow<GetListPokemonResult> =
        when (actions) {
            is GetListPokemonAction ->
                getListPokemonProcessor(
                    number = actions.number
                )
        }

    private fun getListPokemonProcessor(number: Int): Flow<GetListPokemonResult> =
        repository.getListPokemon(page = number)
            .map { listPokemon ->
                if (listPokemon.results?.isEmpty() == true) {
                    GetListPokemonResult.IsEmpty
                }else {
                    GetListPokemonResult.Success(listPokemon)
                }
            }
            .onStart {
                emit(GetListPokemonResult.InProgress)
            }
            .catch { e ->
                emit(GetListPokemonResult.Error(e))
            }
            .flowOn(Dispatchers.IO)
            .distinctUntilChanged()
}