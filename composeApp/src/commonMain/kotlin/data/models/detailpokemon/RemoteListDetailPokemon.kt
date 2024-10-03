package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.listpokemon.RemotePokemon
import kotlinx.serialization.Serializable

@Serializable
data class RemoteListDetailPokemon(
    val abilities: List<RemoteAbilities?>?,
    val baseexperience: Int?,
    val cries: RemoteCries?,
    val forms: List<RemotePokemon?>?,
    val gameindices: List<RemoteGameIndices?>?,
    val height: Int?,
    val helditems: List<RemoteHeldItems?>?,
    val id: Int?,
    val isdefault: Boolean?,
    val locationareaencounters: String?,
    val moves: List<RemoteMoves?>?,
    val name: String?,
    val order: Int?,
    val species: RemotePokemon?,
    val sprites: RemoteSprites?,
    val stats: List<RemoteStats?>?,
    val types: List<RemoteType?>?,
    val weight: Int?
)