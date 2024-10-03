package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.listpokemon.RemotePokemon
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGameIndices (
    val gameindex: Int?,
    val version: RemotePokemon?
)