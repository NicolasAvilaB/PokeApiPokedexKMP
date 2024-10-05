package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.Constants.LATEST
import data.models.Constants.LEGACY
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteCries (
    @SerialName(LATEST) val latest: String?,
    @SerialName(LEGACY) val legacy: String?
)