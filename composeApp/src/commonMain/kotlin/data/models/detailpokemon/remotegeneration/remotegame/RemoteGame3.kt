package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame

import kotlinx.serialization.Serializable

@Serializable
data class RemoteGame3(
    val backdefault: String?,
    val backshiny: String?,
    val frontdefault: String?,
    val frontshiny: String?,
)