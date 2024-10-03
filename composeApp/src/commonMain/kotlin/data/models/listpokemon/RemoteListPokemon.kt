package data.models.listpokemon

import kotlinx.serialization.Serializable

@Serializable
data class RemoteListPokemon(
    val count: Int?,
    val next: String?,
    val previous: String?,
    val results: List<RemotePokemon?>?,
)