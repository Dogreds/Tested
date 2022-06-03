package com.example.jetpack_recycler.newtork

import com.example.jetpack_recycler.data.HarryResponceItem
import com.example.jetpack_recycler.di.AppModule
import retrofit2.http.GET

interface HarryResponce {
    @GET("characters")
    suspend fun getActor():List<HarryResponceItem>
}