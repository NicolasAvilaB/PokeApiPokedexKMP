package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame

import data.models.Constants.FRONT_DEFAULT
import data.models.Constants.FRONT_FEMALE
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGameIcons7(
    @SerialName(FRONT_DEFAULT) val frontdefault: String?,
    @SerialName(FRONT_FEMALE) val frontfemale: String?,
)