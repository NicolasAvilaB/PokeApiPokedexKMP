package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame.RemoteGame4
import data.models.Constants.DIAMOND_PEARL
import data.models.Constants.HEARTGOLD_SOULSILVER
import data.models.Constants.PLATINUM
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGeneration4(
    @SerialName(DIAMOND_PEARL) val diamondpearl: RemoteGame4?,
    @SerialName(HEARTGOLD_SOULSILVER) val heartgoldsoulsilver: RemoteGame4?,
    @SerialName(PLATINUM) val platinum: RemoteGame4?,
)
