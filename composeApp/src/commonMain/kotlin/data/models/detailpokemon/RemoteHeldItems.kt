package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.Constants.ITEM
import data.models.Constants.VERSION_DETAILS
import data.models.listpokemon.RemotePokemon
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteHeldItems (
    @SerialName(ITEM) val item: RemotePokemon?,
    @SerialName(VERSION_DETAILS) val versiondetails: List<RemoteVersionDetail?>?
)