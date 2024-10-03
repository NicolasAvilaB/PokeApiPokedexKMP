package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame

import kotlinx.serialization.Serializable

@Serializable
data class RemoteGame5(
    val animated: RemoteGame5Animated?,
    val backdefault: String?,
    val backfemale: String?,
    val backshiny: String?,
    val backshinyfemale: String?,
    val frontdefault: String?,
    val frontfemale: String?,
    val frontshiny: String?,
    val frontshinyfemale: String?,
)