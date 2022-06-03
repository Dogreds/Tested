package com.example.jetpack_recycler.repository

import com.example.jetpack_recycler.data.HarryResponceItem
import com.example.jetpack_recycler.newtork.HarryResponce
import javax.inject.Inject

class Repository @Inject constructor(private val harryResponce: HarryResponce) {
    suspend fun gets():List<HarryResponceItem> = harryResponce.getActor()
}