package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration

import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.RemoteOfficialArtwork
import com.pokemon.ui.pokeapipokedex.data.models.detailpokemon.remotegeneration.remotegame.RemoteGame3
import data.models.Constants.EMERALD
import data.models.Constants.FIRERED_LEAFGREEN
import data.models.Constants.RUBY_SAPPHIRE
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteGeneration3(
    @SerialName(EMERALD) val emerald: RemoteOfficialArtwork?,
    @SerialName(FIRERED_LEAFGREEN) val fireredleafgreen: RemoteGame3?,
    @SerialName(RUBY_SAPPHIRE) val rubysapphire: RemoteGame3?,
)
