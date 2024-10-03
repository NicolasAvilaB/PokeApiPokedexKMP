package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame.RemoteGame4
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGeneration4(
    val diamondpearl: RemoteGame4?,
    val heartgoldsoulsilver: RemoteGame4?,
    val platinum: RemoteGame4?,
)
