package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.RemoteHome
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame.RemoteGameIcons7
import data.models.Constants.ICONS
import data.models.Constants.ULTRA_SUN_ULTRA_MOON
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGeneration7(
    @SerialName(ICONS) val icons: RemoteGameIcons7?,
    @SerialName(ULTRA_SUN_ULTRA_MOON) val ultrasunultramoon: RemoteHome?
)
