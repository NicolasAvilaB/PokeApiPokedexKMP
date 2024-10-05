package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.Constants.LEVEL_LEARNED_AT
import data.models.Constants.MOVE_LEARN_METHOD
import data.models.Constants.VERSION_GROUP
import data.models.listpokemon.RemotePokemon
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteVersionGroupDetail (
    @SerialName(LEVEL_LEARNED_AT) val levellearnedat: Int?,
    @SerialName(MOVE_LEARN_METHOD) val movelearnmethod: RemotePokemon?,
    @SerialName(VERSION_GROUP) val versiongroup: RemotePokemon?
)