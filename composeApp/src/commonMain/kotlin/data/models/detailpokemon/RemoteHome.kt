package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import kotlinx.serialization.Serializable

@Serializable
data class RemoteHome(
    val frontdefault: String?,
    val frontfemale: String?,
    val frontshiny: String?,
    val frontshinyfemale: String?
)
