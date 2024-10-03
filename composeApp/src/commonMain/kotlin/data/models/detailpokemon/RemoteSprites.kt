package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import kotlinx.serialization.Serializable

@Serializable
data class RemoteSprites(
    val backdefault: String?,
    val backfemale: String?,
    val backshiny: String?,
    val backshinyfemale: String?,
    val frontdefault: String?,
    val frontfemale: String?,
    val frontshiny: String?,
    val frontshinyfemale: String?,
    val other: RemoteOther?,
    val versions: RemoteVersions?
)