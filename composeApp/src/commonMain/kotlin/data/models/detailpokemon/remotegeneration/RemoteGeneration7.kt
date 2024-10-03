package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.RemoteHome
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame.RemoteGameIcons7
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGeneration7(
    val icons: RemoteGameIcons7?,
    val ultrasunultramoon: RemoteHome?
)
