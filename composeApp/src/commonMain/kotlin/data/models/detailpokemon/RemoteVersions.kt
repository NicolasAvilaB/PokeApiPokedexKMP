package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration1
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration2
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration3
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration4
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration5
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration6
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration7
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.RemoteGeneration8
import data.models.Constants.GENERATION_I
import data.models.Constants.GENERATION_II
import data.models.Constants.GENERATION_III
import data.models.Constants.GENERATION_IV
import data.models.Constants.GENERATION_V
import data.models.Constants.GENERATION_VI
import data.models.Constants.GENERATION_VII
import data.models.Constants.GENERATION_VIII
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteVersions(
    @SerialName(GENERATION_I) val generationi: RemoteGeneration1?,
    @SerialName(GENERATION_II) val generationii: RemoteGeneration2?,
    @SerialName(GENERATION_III) val generationiii: RemoteGeneration3?,
    @SerialName(GENERATION_IV) val generationiv: RemoteGeneration4?,
    @SerialName(GENERATION_V) val generationv: RemoteGeneration5?,
    @SerialName(GENERATION_VI) val generationvi: RemoteGeneration6?,
    @SerialName(GENERATION_VII) val generationvii: RemoteGeneration7?,
    @SerialName(GENERATION_VIII) val generationviii: RemoteGeneration8?
)
