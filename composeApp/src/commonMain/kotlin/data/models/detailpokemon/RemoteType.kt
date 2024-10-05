package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.Constants.SLOT
import data.models.Constants.TYPE
import data.models.listpokemon.RemotePokemon
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteType(
    @SerialName(SLOT) val slot: Int?,
    @SerialName(TYPE) val type: RemotePokemon?
)
