package pl.imobitech.androidkurs.features.characters.presentation.model

import pl.imobitech.androidkurs.features.characters.domain.model.Character
import pl.imobitech.androidkurs.features.characters.domain.model.CharacterOrigin

data class CharacterDisplayable(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: CharacterOrigin,
    val location: CharacterOrigin,
    val episode: List<String>,
    val image: String,
    val url: String
) {
    constructor(character: Character) : this(
        id = character.id,
        name = character.name,
        status = character.status,
        species = character.species,
        type = character.type,
        gender = character.gender,
        origin = character.origin,
        location = character.origin,
        image = character.image,
        episode = character.episode,
        url = character.url
    )
}