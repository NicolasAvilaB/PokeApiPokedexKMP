package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame

import data.models.Constants.BACK_DEFAULT
import data.models.Constants.BACK_GRAY
import data.models.Constants.BACK_TRANSPARENT
import data.models.Constants.FRONT_DEFAULT
import data.models.Constants.FRONT_GRAY
import data.models.Constants.FRONT_TRANSPARENT
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGame1(
    @SerialName(BACK_DEFAULT) val backdefault: String?,
    @SerialName(BACK_GRAY) val backgray: String?,
    @SerialName(BACK_TRANSPARENT) val backtransparent: String?,
    @SerialName(FRONT_DEFAULT) val frontdefault: String?,
    @SerialName(FRONT_GRAY) val frontgray: String?,
    @SerialName(FRONT_TRANSPARENT) val fronttransparent: String?
)