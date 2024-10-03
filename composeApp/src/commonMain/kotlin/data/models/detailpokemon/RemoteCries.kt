package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import kotlinx.serialization.Serializable

@Serializable
data class RemoteCries (
    val latest: String?,
    val legacy: String?
)