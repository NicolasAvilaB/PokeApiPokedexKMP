package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.listpokemon.RemotePokemon
import kotlinx.serialization.Serializable

@Serializable
data class RemoteStats(
    val basestat: Int?,
    val effort: Int?,
    val stat: RemotePokemon?
)
