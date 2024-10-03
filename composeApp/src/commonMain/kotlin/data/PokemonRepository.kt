package data

import data.models.listpokemon.RemoteListPokemon
import data.sources.PokemonSourceRemote
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class PokemonRepository(
    private val remote: PokemonSourceRemote
) {
    fun getListPokemon(page: Int): Flow<RemoteListPokemon> = flow {
        val listPokemon = remote.getListPokemonRemote(page)
        emit(listPokemon)
    }
}