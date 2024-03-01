package com.example.weatherapp.core.network

import android.annotation.SuppressLint
import com.chuckerteam.chucker.api.ChuckerCollector
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.chuckerteam.chucker.api.RetentionManager
import com.example.weatherapp.core.app.App
import com.example.weatherapp.core.network.service.WeatherService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient  {

    private fun getRetrofit():Retrofit {

        return Retrofit.Builder()
            .baseUrl(" https://api.weatherapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(clinetOkHttp())
            .build()
    }
    private  fun clinetOkHttp(): OkHttpClient{

        return  OkHttpClient.Builder()
            .addInterceptor(chuckerInterceptor)
            .build()
    }

    private val  chuckerCollector = ChuckerCollector(
        context = App.context!!,
        showNotification = true,
        retentionPeriod = RetentionManager.Period.ONE_HOUR
    )
   @SuppressLint("StaticFieldLeak")
   private val chuckerInterceptor = ChuckerInterceptor.Builder(App.context!! )
        .collector(chuckerCollector)
        .maxContentLength(250_000L)
        .alwaysReadResponseBody(true)
        .build()

    // Create Service

    fun  createWeatherService():WeatherService{
        return getRetrofit().create(WeatherService::class.java)
    }

}