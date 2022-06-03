package com.example.jetpack_recycler.data

import kotlinx.serialization.Serializable

@Serializable
data class HarryResponceItem(
    var actor: String,
    var alive: Boolean,
    var alternate_actors: List<Any>,
    var alternate_names: List<Any>,
    var ancestry: String,
    var dateOfBirth: String,
    var eyeColour: String,
    var gender: String,
    var hairColour: String,
    var hogwartsStaff: Boolean,
    var hogwartsStudent: Boolean,
    var house: String,
    var image: String,
    var name: String,
    var patronus: String,
    var species: String,
    var wand: Wand,
    var wizard: Boolean,
    var yearOfBirth: String
)