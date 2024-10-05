package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.RemoteHome
import data.models.Constants.OMEGARUBY_ALPHASAPPHIRE
import data.models.Constants.X_Y
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGeneration6(
    @SerialName(OMEGARUBY_ALPHASAPPHIRE) val omegarubyalphasapphire: RemoteHome?,
    @SerialName(X_Y) val xy: RemoteHome?
)
