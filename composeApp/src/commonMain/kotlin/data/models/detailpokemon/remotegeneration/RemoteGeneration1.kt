package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame.RemoteGame1
import data.models.Constants.RED_BLUE
import data.models.Constants.YELLOW
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGeneration1(
    @SerialName(RED_BLUE) val redblue: RemoteGame1?,
    @SerialName(YELLOW) val yellow: RemoteGame1?
)
