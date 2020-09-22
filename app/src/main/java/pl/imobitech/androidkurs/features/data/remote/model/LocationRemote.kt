package pl.imobitech.androidkurs.features.data.remote.model

import com.google.gson.annotations.SerializedName
import pl.imobitech.androidkurs.features.episodes.domain.model.Location


data class LocationRemote(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("type") val type: String,
    @SerializedName("residents") val residents: List<String>,
    @SerializedName("url") val url: String,
    @SerializedName("dimension") val dimension: String,
    @SerializedName("created") val created: String
) {
    fun toLocation() = Location(
        id = id,
        name = name,
        type = type,
        residents = residents,
        url = url,
        dimension = dimension
    )
}