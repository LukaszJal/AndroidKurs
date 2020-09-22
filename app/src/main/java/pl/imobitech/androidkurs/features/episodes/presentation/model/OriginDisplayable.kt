package pl.imobitech.androidkurs.features.episodes.presentation.model

import pl.imobitech.androidkurs.features.episodes.domain.model.Origin

data class OriginDisplayable(
    val name: String,
    val url: String
) {
    constructor(origin: Origin) : this(
        name = origin.name,
        url = origin.url
    )
}