package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame.RemoteGame2
import data.models.Constants.CRYSTAL
import data.models.Constants.GOLD
import data.models.Constants.SILVER
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGeneration2(
    @SerialName(CRYSTAL) val crystal: RemoteGame2?,
    @SerialName(GOLD) val gold: RemoteGame2?,
    @SerialName(SILVER) val silver: RemoteGame2?,
)
