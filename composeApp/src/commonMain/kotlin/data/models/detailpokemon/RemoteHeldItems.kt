package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.listpokemon.RemotePokemon
import kotlinx.serialization.Serializable

@Serializable
data class RemoteHeldItems (
    val item: RemotePokemon?,
    val versiondetails: List<RemoteVersionDetail?>?
)