package com.example.musicapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface ApiInterface {
    @Headers("X-RapidAPI-Key:  477612e981msh393ce2fd910799ep17630ajsnccc0b15eea07",
                     "X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q")query: String) : Call<MyData >
}