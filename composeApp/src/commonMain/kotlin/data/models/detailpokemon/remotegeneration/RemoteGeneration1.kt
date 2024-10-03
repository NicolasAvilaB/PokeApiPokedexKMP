package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame.RemoteGame1
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGeneration1(
    val redblue: RemoteGame1?,
    val yellow: RemoteGame1?
)
