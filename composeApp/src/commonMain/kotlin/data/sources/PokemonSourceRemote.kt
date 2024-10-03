package data.sources

import data.models.listpokemon.RemoteListPokemon

interface PokemonSourceRemote {
    suspend fun getListPokemonRemote(page: Int): RemoteListPokemon
}