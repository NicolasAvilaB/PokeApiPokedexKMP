package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.listpokemon.RemotePokemon
import kotlinx.serialization.Serializable

@Serializable
data class RemoteVersionGroupDetail (
    val levellearnedat: Int?,
    val movelearnmethod: RemotePokemon?,
    val versiongroup: RemotePokemon?
)