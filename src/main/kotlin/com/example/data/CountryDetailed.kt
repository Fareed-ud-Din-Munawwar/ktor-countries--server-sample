package com.example.data

import kotlinx.serialization.Serializable

@Serializable
data class CountryDetailed(
    val id: Int,
    val imageUrl: String,
    val name: String,
    val independenceDate: String,
    val smallDescription: String,
    val detailedDescription: String
)
