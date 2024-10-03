package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.listpokemon.RemotePokemon
import kotlinx.serialization.Serializable

@Serializable
data class RemoteAbilities (
    val ability: RemotePokemon?,
    val ishidden: Boolean?,
    val slot: Int?
)