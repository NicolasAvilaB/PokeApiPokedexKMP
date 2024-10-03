package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame.RemoteGame2
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGeneration2(
    val crystal: RemoteGame2?,
    val gold: RemoteGame2?,
    val silver: RemoteGame2?,
)
