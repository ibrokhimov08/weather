package com.example.weatherapp.core.repository

import android.util.Log
import com.example.weatherapp.core.model.current.CurrentWeatherResponse
import com.example.weatherapp.core.network.ApiClient
import com.example.weatherapp.core.network.service.WeatherService
import com.example.weatherapp.core.util.ResultWrapper
import com.example.weatherapp.core.util.Utils.API_KEY
import javax.inject.Inject


class WeatherRepository @Inject constructor(private val service: WeatherService,val api :ApiClient) {



    suspend fun getWeatherData(): ResultWrapper<CurrentWeatherResponse?, Any?> {



        val data = api.createWeatherService().loadCurrentWeather(API_KEY, "Tashkent")

        return ResultWrapper.Success(code = data.code(), response = data.body())

        Log.d("TAGaaa", "repo: ${data?.body()?.current?.tempF}")


    }


}