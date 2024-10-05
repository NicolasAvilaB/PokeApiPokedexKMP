package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.Constants.BASE_STAT
import data.models.Constants.EFFORT
import data.models.Constants.STAT
import data.models.listpokemon.RemotePokemon
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteStats(
    @SerialName(BASE_STAT) val basestat: Int?,
    @SerialName(EFFORT) val effort: Int?,
    @SerialName(STAT) val stat: RemotePokemon?
)
