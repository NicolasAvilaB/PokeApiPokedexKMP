package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import kotlinx.serialization.Serializable

@Serializable
data class RemoteOtherDetail(
    val front_default: String?,
    val front_female: String?
)
