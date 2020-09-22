package pl.imobitech.androidkurs.features.episodes.presentation.model

import pl.imobitech.androidkurs.features.episodes.domain.model.Character
import pl.imobitech.androidkurs.features.episodes.domain.model.Location
import pl.imobitech.androidkurs.features.episodes.domain.model.Origin

data class CharacterDisplayable(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: Origin,
    val location: Location,
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
        location = character.location,
        image = character.image,
        episode = character.episode,
        url = character.url
    )
}