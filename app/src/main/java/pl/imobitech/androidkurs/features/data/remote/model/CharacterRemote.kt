package pl.imobitech.androidkurs.features.data.remote.model

import com.google.gson.annotations.SerializedName
import pl.imobitech.androidkurs.features.characters.domain.model.Character
import pl.imobitech.androidkurs.features.characters.domain.model.CharacterLocation
import pl.imobitech.androidkurs.features.characters.domain.model.CharacterOrigin


data class CharacterRemote(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("status") val status: String,
    @SerializedName("species") val species: String,
    @SerializedName("type") val type: String,
    @SerializedName("gender") val gender: String,
    @SerializedName("origin") val characterOriginRemote: CharacterOriginRemote,
    @SerializedName("location") val characterLocationRemote: CharacterLocationRemote,
    @SerializedName("image") val image: String,
    @SerializedName("episode") val episode: List<String>,
    @SerializedName("url") val url: String,
    @SerializedName("created") val created: String
) {
    fun toCharacter() =
        Character(
            id = id,
            name = name,
            status = status,
            species = species,
            type = type,
            gender = gender,
            origin = characterOriginRemote.toCharacterOrigin(),
            location = characterLocationRemote.toCharacterLocation(),
            image = image,
            episode = episode,
            url = url
        )
}


data class CharacterOriginRemote(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
) {
    fun toCharacterOrigin() = CharacterOrigin(
        name = name,
        url = url
    )
}

data class CharacterLocationRemote(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
) {
    fun toCharacterLocation() = CharacterLocation(
        name = name,
        url = url
    )
}


