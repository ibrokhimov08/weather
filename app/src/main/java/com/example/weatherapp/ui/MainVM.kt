package com.example.weatherapp.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.core.model.current.CurrentWeatherResponse
import com.example.weatherapp.core.repository.WeatherRepository
import com.example.weatherapp.core.util.ResultWrapper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainVM @Inject constructor( val repository: WeatherRepository) : ViewModel() {

    val weatherLiveData: MutableLiveData<CurrentWeatherResponse?> = MutableLiveData()
    val errorLiveData: MutableLiveData<String?> = MutableLiveData()

    fun getWeatherInformation() {

        viewModelScope.launch {
            val result = repository.getWeatherData()

            when(result){
               is ResultWrapper.Success ->{

                   result.response.let {
                       weatherLiveData.value = it
                       Log.d("TAGaaa", "getWeatherInformation: ${it?.current?.tempF}")
                   }

               }

                else -> {

                    errorLiveData.value= "Error"

                }
            }

        }

    }

}