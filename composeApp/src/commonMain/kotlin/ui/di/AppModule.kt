package ui.di

import data.PokemonRepository
import data.remote.PokemonRemoteImpl
import data.sources.PokemonSourceRemote
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import org.koin.dsl.module
import presentation.mainlistpokemon.MainListPokemonProcessor
import presentation.mainlistpokemon.MainListPokemonReducer
import presentation.mainlistpokemon.MainListPokemonViewModel

fun AppModule() = module {
    single<HttpClient> {
        HttpClient {
            install(ContentNegotiation) {
                json()
            }
        }
    }

    single<PokemonSourceRemote> {
        PokemonRemoteImpl(get())
    }

    single<PokemonRepository> {
        PokemonRepository(get())
    }

    single {
        MainListPokemonProcessor(get())
    }

    single {
        MainListPokemonReducer()
    }

    factory {
        MainListPokemonViewModel(get(), get())
    }
}