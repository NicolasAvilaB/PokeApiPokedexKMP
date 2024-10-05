package com.pokemon.ui.pokeapipokedex.data.models.detailpokemon

import data.models.Constants.ABILITIES
import data.models.Constants.BASE_EXPERIENCE
import data.models.Constants.CRIES
import data.models.Constants.FORMS
import data.models.Constants.GAME_INDICES
import data.models.Constants.HEIGHT
import data.models.Constants.HELD_ITEMS
import data.models.Constants.ID
import data.models.Constants.IS_DEFAULT
import data.models.Constants.LOCATION_AREA_ENCOUNTERS
import data.models.Constants.MOVES
import data.models.Constants.NAME
import data.models.Constants.ORDER
import data.models.Constants.PAST_ABILITIES
import data.models.Constants.PAST_TYPES
import data.models.Constants.SPECIES
import data.models.Constants.SPRITES
import data.models.Constants.STATS
import data.models.Constants.TYPES
import data.models.Constants.WEIGHT
import data.models.listpokemon.RemotePokemon
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteListDetailPokemon(
    @SerialName(ABILITIES) val abilities: List<RemoteAbilities?>?,
    @SerialName(BASE_EXPERIENCE) val baseexperience: Int?,
    @SerialName(CRIES) val cries: RemoteCries?,
    @SerialName(FORMS) val forms: List<RemotePokemon?>?,
    @SerialName(GAME_INDICES) val gameindices: List<RemoteGameIndices?>?,
    @SerialName(HEIGHT) val height: Int?,
    @SerialName(HELD_ITEMS) val helditems: List<RemoteHeldItems?>?,
    @SerialName(ID) val id: Int?,
    @SerialName(IS_DEFAULT) val isdefault: Boolean?,
    @SerialName(LOCATION_AREA_ENCOUNTERS) val locationareaencounters: String?,
    @SerialName(MOVES) val moves: List<RemoteMoves?>?,
    @SerialName(NAME) val name: String?,
    @SerialName(ORDER) val order: Int?,
    @SerialName(PAST_ABILITIES) val pastabilities: List<RemotePokemon?>?,
    @SerialName(PAST_TYPES) val pasttypes: List<RemotePokemon?>?,
    @SerialName(SPECIES) val species: RemotePokemon?,
    @SerialName(SPRITES) val sprites: RemoteSprites?,
    @SerialName(STATS) val stats: List<RemoteStats?>?,
    @SerialName(TYPES) val types: List<RemoteType?>?,
    @SerialName(WEIGHT) val weight: Int?
)