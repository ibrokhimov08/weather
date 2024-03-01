package com.example.weatherapp.core.di.repo

import com.example.weatherapp.core.network.ApiClient
import com.example.weatherapp.core.network.service.WeatherService
import com.example.weatherapp.core.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {


    @[Provides Singleton]
    fun provideNewsRepository(service: WeatherService, api:ApiClient): WeatherRepository {
        return WeatherRepository(service, api)
    }
}