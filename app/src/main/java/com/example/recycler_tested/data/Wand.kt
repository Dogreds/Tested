package com.example.jetpack_recycler.data

import kotlinx.serialization.Serializable

@Serializable
data class Wand(
    var core: String,
    var length: String,
    var wood: String
)