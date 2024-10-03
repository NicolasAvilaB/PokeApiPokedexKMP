package data.remote

import data.models.Constants.BASE_URL
import data.models.listpokemon.RemoteListPokemon
import data.sources.PokemonSourceRemote
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

internal class PokemonRemoteImpl(
    private val httpClient: HttpClient
) : PokemonSourceRemote {

    override suspend fun getListPokemonRemote(page: Int): RemoteListPokemon {
        return httpClient.get("$BASE_URL/api/v2/pokemon") {
            url {
                parameters.append("offset", page.toString())
                parameters.append("limit", 20.toString())
            }
        }.body<RemoteListPokemon>()
    }
}