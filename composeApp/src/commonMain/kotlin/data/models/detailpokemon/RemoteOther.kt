package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import kotlinx.serialization.Serializable

@Serializable
data class RemoteOther(
    val dreamworld: RemoteOtherDetail?,
    val home: RemoteHome?,
    val officialartwork: RemoteOfficialArtwork?,
    val showdown: RemoteShowDown?
)
