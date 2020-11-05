package pl.imobitech.androidkurs.features.locations.domain.model

data class Location(
    val id: Int,
    val name: String,
    val type: String,
    val residents: List<String>,
    val dimension: String,
    val url: String
)