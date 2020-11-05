package pl.imobitech.androidkurs.features.characters.domain.model

data class Character(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: CharacterOrigin,
    val location: CharacterLocation,
    val episode: List<String>,
    val image: String,
    val url: String
)
