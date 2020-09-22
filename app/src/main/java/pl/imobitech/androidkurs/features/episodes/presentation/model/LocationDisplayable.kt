package pl.imobitech.androidkurs.features.episodes.presentation.model

import pl.imobitech.androidkurs.features.episodes.domain.model.Location

data class LocationDisplayable(
    val id: Int,
    val name: String,
    val type: String,
    val residents: List<String>,
    val dimension: String,
    val url: String
) {
    constructor(location: Location) : this(
        id = location.id,
        name = location.name,
        type = location.type,
        residents = location.residents,
        dimension = location.dimension,
        url = location.url
    )
}