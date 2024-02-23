package com.example.composepaging3libraryexample.data.mappers

import com.example.composepaging3libraryexample.data.local.BeerEntity
import com.example.composepaging3libraryexample.data.remote.BeerDto
import com.example.composepaging3libraryexample.domain.Beer

fun BeerDto.toBeerEntity() : BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer() : Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}