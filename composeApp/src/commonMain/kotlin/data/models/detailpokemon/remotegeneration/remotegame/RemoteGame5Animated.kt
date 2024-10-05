package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame

import data.models.Constants.BACK_DEFAULT
import data.models.Constants.BACK_FEMALE
import data.models.Constants.BACK_SHINY
import data.models.Constants.BACK_SHINY_FEMALE
import data.models.Constants.FRONT_DEFAULT
import data.models.Constants.FRONT_FEMALE
import data.models.Constants.FRONT_SHINY
import data.models.Constants.FRONT_SHINY_FEMALE
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGame5Animated(
    @SerialName(BACK_DEFAULT) val backdefault: String?,
    @SerialName(BACK_FEMALE) val backfemale: String?,
    @SerialName(BACK_SHINY) val backshiny: String?,
    @SerialName(BACK_SHINY_FEMALE) val backshinyfemale: String?,
    @SerialName(FRONT_DEFAULT) val frontdefault: String?,
    @SerialName(FRONT_FEMALE) val frontfemale: String?,
    @SerialName(FRONT_SHINY) val frontshiny: String?,
    @SerialName(FRONT_SHINY_FEMALE) val frontshinyfemale: String?,
)