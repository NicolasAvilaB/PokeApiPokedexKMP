package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import kotlinx.serialization.Serializable

@Serializable
data class RemoteOfficialArtwork(
    val frontdefault: String?,
    val frontshiny: String?
)
