package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.Constants.FRONT_DEFAULT
import data.models.Constants.FRONT_SHINY
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteOfficialArtwork(
    @SerialName(FRONT_DEFAULT) val frontdefault: String?,
    @SerialName(FRONT_SHINY) val frontshiny: String?
)
