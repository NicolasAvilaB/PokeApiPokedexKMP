package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration1
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration2
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration3
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration4
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration5
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration6
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration7
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration8
import kotlinx.serialization.Serializable

@Serializable
data class RemoteVersions(
    val generationi: RemoteGeneration1?,
    val generationii: RemoteGeneration2?,
    val generationiii: RemoteGeneration3?,
    val generationiv: RemoteGeneration4?,
    val generationv: RemoteGeneration5?,
    val generationvi: RemoteGeneration6?,
    val generationvii: RemoteGeneration7?,
    val generationviii: RemoteGeneration8?
)
