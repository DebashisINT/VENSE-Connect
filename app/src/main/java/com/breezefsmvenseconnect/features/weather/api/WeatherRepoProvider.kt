package com.breezefsmvenseconnect.features.weather.api

import com.breezefsmvenseconnect.features.task.api.TaskApi
import com.breezefsmvenseconnect.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}