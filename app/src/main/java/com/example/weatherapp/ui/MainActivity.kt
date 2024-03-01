package com.example.weatherapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import uz.ibrokhimov.mynewsapi.R
@AndroidEntryPoint

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    /*private fun sendRequest(region: String) {
        val service = ApiClient.createWeatherService()
        service.loadCurrentWeather(API_KEY, region)
            .enqueue(object : Callback<CarrentWeatherResponse> {
                override fun onResponse(
                    call: Call<CarrentWeatherResponse>,
                    response: Response<CarrentWeatherResponse>
                ) {
                    if (response.isSuccessful) {
                        val data = response.body()!!
                        binding.textView.text = "${data.current.tempC}\n${data.location.region}"
                        binding.progressBar.isVisible = false
                    } else {
                        binding.progressBar.isVisible = false
                        binding.textView.text = "Clent Eror"
                    }
                }

                override fun onFailure(call: Call<CarrentWeatherResponse>, t: Throwable) {
                    binding.progressBar.isVisible = false
                    binding.textView.text = "Fatal"
                }
            })
    }*/

}