package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.Constants.FRONT_DEFAULT
import data.models.Constants.FRONT_FEMALE
import data.models.Constants.FRONT_SHINY
import data.models.Constants.FRONT_SHINY_FEMALE
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteHome(
    @SerialName(FRONT_DEFAULT) val frontdefault: String?,
    @SerialName(FRONT_FEMALE) val frontfemale: String?,
    @SerialName(FRONT_SHINY) val frontshiny: String?,
    @SerialName(FRONT_SHINY_FEMALE) val frontshinyfemale: String?
)
