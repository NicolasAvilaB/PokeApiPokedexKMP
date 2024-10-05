package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.Constants.ABILITY
import data.models.Constants.IS_HIDDEN
import data.models.Constants.SLOT
import data.models.listpokemon.RemotePokemon
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteAbilities (
    @SerialName(ABILITY) val ability: RemotePokemon?,
    @SerialName(IS_HIDDEN) val ishidden: Boolean?,
    @SerialName(SLOT) val slot: Int?
)