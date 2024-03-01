package com.example.weatherapp.core.model.current


import com.google.gson.annotations.SerializedName

data class Current(
    @SerializedName("cloud")
    val cloud: Int, // 0
    @SerializedName("condition")
    val condition: Condition,
    @SerializedName("feelslike_c")
    val feelslikeC: Double, // 18.0
    @SerializedName("feelslike_f")
    val feelslikeF: Double, // 64.4
    @SerializedName("gust_kph")
    val gustKph: Double, // 18.4
    @SerializedName("gust_mph")
    val gustMph: Double, // 11.4
    @SerializedName("humidity")
    val humidity: Int, // 32
    @SerializedName("is_day")
    val isDay: Int, // 1
    @SerializedName("last_updated")
    val lastUpdated: String, // 2023-12-28 15:15
    @SerializedName("last_updated_epoch")
    val lastUpdatedEpoch: Int, // 1703758500
    @SerializedName("precip_in")
    val precipIn: Double, // 0.0
    @SerializedName("precip_mm")
    val precipMm: Double, // 0.0
    @SerializedName("pressure_in")
    val pressureIn: Double, // 29.94
    @SerializedName("pressure_mb")
    val pressureMb: Double, // 1014.0
    @SerializedName("temp_c")
    val tempC: Double, // 18.0
    @SerializedName("temp_f")
    val tempF: Double, // 64.4
    @SerializedName("uv")
    val uv: Double, // 4.0
    @SerializedName("vis_km")
    val visKm: Double, // 10.0
    @SerializedName("vis_miles")
    val visMiles: Double, // 6.0
    @SerializedName("wind_degree")
    val windDegree: Int, // 60
    @SerializedName("wind_dir")
    val windDir: String, // ENE
    @SerializedName("wind_kph")
    val windKph: Double, // 11.2
    @SerializedName("wind_mph")
    val windMph: Double // 6.9
)