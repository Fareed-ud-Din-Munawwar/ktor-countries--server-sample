package com.example.data

import kotlinx.serialization.Serializable

@Serializable
data class Country(
    val id : Int,
    val imageUrl: String,
    val name:String,
    val smallDescription: String,
)
