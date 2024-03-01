package com.example.weatherapp.core.network.service

import com.example.weatherapp.core.model.current.CurrentWeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherService {

    @GET("/v1/current.json")
    suspend fun loadCurrentWeather(
        @Query("key") apiKey: String,
        @Query("q") city: String
    ): Response<CurrentWeatherResponse>

}