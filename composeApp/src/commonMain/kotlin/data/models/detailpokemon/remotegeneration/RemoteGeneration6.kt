package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.RemoteHome
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGeneration6(
    val omegarubyalphasapphire: RemoteHome?,
    val xy: RemoteHome?
)
