package data.sources

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.RemoteListDetailPokemon
import data.models.listpokemon.RemoteListPokemon

interface PokemonSourceRemote {
    suspend fun getListPokemonRemote(page: Int): RemoteListPokemon
    suspend fun getDetailPokemon(namePokemon: String): RemoteListDetailPokemon
}