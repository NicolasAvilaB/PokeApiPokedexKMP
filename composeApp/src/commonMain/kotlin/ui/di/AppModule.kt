package ui.di

import com.pokemon.ui.pokeapipokedex.presentation.detailpokemon.DetailPokemonProcessor
import com.pokemon.ui.pokeapipokedex.presentation.detailpokemon.DetailPokemonReducer
import com.pokemon.ui.pokeapipokedex.presentation.detailpokemon.DetailPokemonViewModel
import data.PokemonRepository
import data.remote.PokemonRemoteImpl
import data.sources.PokemonSourceRemote
import imagesview.ImagesViewController
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import mediaplayer.MediaPlayerController
import org.koin.dsl.module
import presentation.mainlistpokemon.MainListPokemonProcessor
import presentation.mainlistpokemon.MainListPokemonReducer
import presentation.mainlistpokemon.MainListPokemonViewModel

@OptIn(ExperimentalSerializationApi::class)
fun AppModule() = module {

    single{
        ImagesViewController()
    }

    single {
        MediaPlayerController()
    }

    single<HttpClient> {
        HttpClient {
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                    isLenient = true
                    explicitNulls = false
                })
            }
        }
    }

    single<PokemonSourceRemote> {
        PokemonRemoteImpl(get())
    }

    single<PokemonRepository> {
        PokemonRepository(get())
    }

    factory {
        MainListPokemonProcessor(get())
    }
    factory {
        DetailPokemonProcessor(get())
    }

    single {
        MainListPokemonReducer()
    }

    factory {
        MainListPokemonViewModel(get(), get())
    }

    single {
        DetailPokemonReducer()
    }

    factory {
        DetailPokemonViewModel(get(), get())
    }
}