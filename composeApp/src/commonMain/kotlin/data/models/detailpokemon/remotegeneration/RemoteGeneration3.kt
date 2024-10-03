package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.RemoteOfficialArtwork
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame.RemoteGame3
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGeneration3(
    val emerald: RemoteOfficialArtwork?,
    val fireredleafgreen: RemoteGame3?,
    val rubysapphire: RemoteGame3?,
)
