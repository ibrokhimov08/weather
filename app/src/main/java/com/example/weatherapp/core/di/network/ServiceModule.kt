package com.example.weatherapp.core.di.network

import com.example.weatherapp.core.network.ApiClient
import com.example.weatherapp.core.network.service.WeatherService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit


import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    @[Provides Singleton]
    fun provideNewsService(retrofit: Retrofit): WeatherService {
        return retrofit.create(WeatherService::class.java)
    }


    @[Provides Singleton]
    fun provideApi(): ApiClient {
        return ApiClient
    }



}