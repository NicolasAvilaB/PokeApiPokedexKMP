package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.Constants.RARITY
import data.models.Constants.VERSION
import data.models.listpokemon.RemotePokemon
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteVersionDetail (
    @SerialName(RARITY) val rarity: Int?,
    @SerialName(VERSION) val version: RemotePokemon?,
)