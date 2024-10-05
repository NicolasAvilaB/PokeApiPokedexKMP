package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame.RemoteGame5
import data.models.Constants.BLACK_WHITE
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGeneration5(
    @SerialName(BLACK_WHITE) val blackwhite: RemoteGame5?,
)
