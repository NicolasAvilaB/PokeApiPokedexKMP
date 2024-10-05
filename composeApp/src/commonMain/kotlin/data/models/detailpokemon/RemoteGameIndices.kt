package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.Constants.GAME_INDEX
import data.models.Constants.VERSION
import data.models.listpokemon.RemotePokemon
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGameIndices (
    @SerialName(GAME_INDEX) val gameindex: Int?,
    @SerialName(VERSION) val version: RemotePokemon?
)