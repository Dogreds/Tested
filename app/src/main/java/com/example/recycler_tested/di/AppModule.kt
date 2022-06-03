package com.example.jetpack_recycler.di

import com.example.jetpack_recycler.newtork.HarryResponce
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    val baseurl = "http://hp-api.herokuapp.com/api/"
    val endpoint = "characters"


    @Singleton
    @Provides
    fun retrofits():Retrofit {
        return  Retrofit.Builder()
            .baseUrl(baseurl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Singleton
    @Provides
    fun created(retrofit: Retrofit):HarryResponce
    {
        return  retrofit.create(HarryResponce::class.java)
    }

}