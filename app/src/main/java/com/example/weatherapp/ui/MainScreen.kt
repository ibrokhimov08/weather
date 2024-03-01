package com.example.weatherapp.ui

import android.os.Bundle
import android.view.View
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import coil.load
import dagger.hilt.android.AndroidEntryPoint
import uz.ibrokhimov.mynewsapi.R
import uz.ibrokhimov.mynewsapi.databinding.ScreenMainBinding

@AndroidEntryPoint
class MainScreen : Fragment(R.layout.screen_main){

    private val binding by viewBinding(ScreenMainBinding::bind)
    private val mainVM: MainVM by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainVM.getWeatherInformation()
        loadView()
    }


    private fun loadView() {

        mainVM.weatherLiveData.observe(viewLifecycleOwner) {
            it.let {
                binding.icon.load(it!!.current.condition.icon)
                binding.degree.text = "${it.current.tempC}"
                binding.hl.text = "H:${it.current.feelslikeC}°  L:${it.current.tempF}°"
                binding.function.text = it.current.condition.text
                binding.progressBar.isGone = true
            }
        }
    }



    /*
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var reregion = "Andijon"
        when (item.itemId) {

            R.id.Andijon -> {
                reregion = "Andijon"

            }

            R.id.Namangan -> {
                reregion = "Namangan"
            }

            R.id.Qarshi -> {
                reregion = "Qarshi"

            }

            R.id.Jizzah -> {
                reregion = "Jizzah"

            }

            R.id.Tashkent -> {
                reregion = "Tashkent"
            }
        }
        return true
    }*/

}