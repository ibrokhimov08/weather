package com.example.weatherapp.core.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
    companion object{
        var context :App? = null
        private  set
    }
    override fun onCreate() {
        super.onCreate()
        context = this
    }
}