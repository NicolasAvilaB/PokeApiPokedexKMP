package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame

import kotlinx.serialization.Serializable

@Serializable
data class RemoteGame2(
    val backdefault: String?,
    val backshiny: String?,
    val backshinytransparent: String?,
    val backtransparent: String?,
    val frontdefault: String?,
    val frontshiny: String?,
    val frontshinytransparent: String?,
    val fronttransparent: String?
)