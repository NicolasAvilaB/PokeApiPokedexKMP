package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.Constants.DREAM_WORLD
import data.models.Constants.HOME
import data.models.Constants.OFFICIAL_ARTWORK
import data.models.Constants.SHOWDOWN
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteOther(
    @SerialName(DREAM_WORLD) val dreamworld: RemoteOtherDetail?,
    @SerialName(HOME) val home: RemoteHome?,
    @SerialName(OFFICIAL_ARTWORK) val officialartwork: RemoteOfficialArtwork?,
    @SerialName(SHOWDOWN) val showdown: RemoteShowDown?
)
