package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame

import data.models.Constants.BACK_DEFAULT
import data.models.Constants.BACK_SHINY
import data.models.Constants.FRONT_DEFAULT
import data.models.Constants.FRONT_SHINY
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGame3(
    @SerialName(BACK_DEFAULT) val backdefault: String?,
    @SerialName(BACK_SHINY) val backshiny: String?,
    @SerialName(FRONT_DEFAULT) val frontdefault: String?,
    @SerialName(FRONT_SHINY) val frontshiny: String?,
)