package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.Constants.FRONT_DEFAULT
import data.models.Constants.FRONT_FEMALE
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteOtherDetail(
    @SerialName(FRONT_DEFAULT) val front_default: String?,
    @SerialName(FRONT_FEMALE) val front_female: String?
)
