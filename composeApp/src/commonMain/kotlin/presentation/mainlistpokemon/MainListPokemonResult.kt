package presentation.mainlistpokemon

import data.models.listpokemon.RemoteListPokemon

sealed class MainListPokemonResult {
    sealed class GetListPokemonResult: MainListPokemonResult(){
        object InProgress: GetListPokemonResult()
        object IsEmpty: GetListPokemonResult()
        data class Success(
            val listPokemon: RemoteListPokemon,
        ): GetListPokemonResult()
        data class Error(val error: Throwable): GetListPokemonResult()
    }
}