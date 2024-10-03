package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame

import kotlinx.serialization.Serializable

@Serializable
data class RemoteGame1(
    val backdefault: String?,
    val backgray: String?,
    val backtransparent: String?,
    val frontdefault: String?,
    val frontgray: String?,
    val fronttransparent: String?
)