package data

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.RemoteListDetailPokemon
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

    fun getDetailPokemon(namePokemon: String): Flow<RemoteListDetailPokemon> = flow {
        val detailPokemon = remote.getDetailPokemon(namePokemon)
        emit(detailPokemon)
    }
}