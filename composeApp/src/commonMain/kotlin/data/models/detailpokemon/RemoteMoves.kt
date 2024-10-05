package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.Constants.MOVE
import data.models.Constants.VERSION_GROUP_DETAILS
import data.models.listpokemon.RemotePokemon
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteMoves(
    @SerialName(MOVE) val move: RemotePokemon?,
    @SerialName(VERSION_GROUP_DETAILS) val versiongroupdetails: List<RemoteVersionGroupDetail?>?
)