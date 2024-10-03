package ui.mainlistpokemonscreen

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.merge
import kotlinx.coroutines.launch
import presentation.mainlistpokemon.events.MainListPokemonUIntent
import presentation.mainlistpokemon.events.MainListPokemonUIntent.GetListPokemonUIntent
import presentation.mainlistpokemon.events.MainListPokemonUIntent.RetryIntent

class MainListPokemonIntentHandler {

    var coroutineScope: CoroutineScope? = null

    private val pokemonIntents = MutableSharedFlow<MainListPokemonUIntent>()

    internal fun pokemonUIntents(): Flow<MainListPokemonUIntent> = merge(
        flow { emit(GetListPokemonUIntent(number = 0)) },
        pokemonIntents.asSharedFlow()
    )

    internal fun pagesPokemon(number: Int) =
        coroutineScope?.launch {
            pokemonIntents.emit(GetListPokemonUIntent(number))
        }

    internal fun retryIntent(number: Int) =
        coroutineScope?.launch {
            pokemonIntents.emit(RetryIntent(number))
        }
}