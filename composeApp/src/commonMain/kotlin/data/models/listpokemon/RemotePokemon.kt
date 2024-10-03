package data.models.listpokemon

import kotlinx.serialization.Serializable

@Serializable
data class RemotePokemon(
    val name: String?,
    val url: String?,
)