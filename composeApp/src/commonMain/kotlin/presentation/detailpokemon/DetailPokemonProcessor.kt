package com.pokemon.ui.pokeapipokedex.presentation.detailpokemon

import com.pokemon.ui.pokeapipokedex.presentation.detailpokemon.DetailPokemonResult.GetDetailPokemonResult
import com.pokemon.ui.pokeapipokedex.presentation.detailpokemon.events.DetailPokemonAction
import com.pokemon.ui.pokeapipokedex.presentation.detailpokemon.events.DetailPokemonAction.GetDetailPokemonAction
import data.PokemonRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart

class DetailPokemonProcessor (
    private val repository : PokemonRepository
) {
    fun actionProcessor(actions: DetailPokemonAction): Flow<GetDetailPokemonResult> =
        when (actions) {
            is GetDetailPokemonAction ->
                getDetailPokemonProcessor(
                    namePokemon = actions.namePokemon
                )
        }

    private fun getDetailPokemonProcessor(namePokemon: String): Flow<GetDetailPokemonResult> =
        repository.getDetailPokemon(namePokemon = namePokemon)
            .map { detailListPokemon ->
                if (detailListPokemon.abilities?.isEmpty() == true) {
                    GetDetailPokemonResult.IsEmpty
                }else {
                    GetDetailPokemonResult.Success(detailListPokemon)
                }
            }
            .onStart {
                emit(GetDetailPokemonResult.InProgress)
            }
            .catch { e ->
                emit(GetDetailPokemonResult.Error(e))
            }
            .flowOn(Dispatchers.IO)
            .distinctUntilChanged()
}