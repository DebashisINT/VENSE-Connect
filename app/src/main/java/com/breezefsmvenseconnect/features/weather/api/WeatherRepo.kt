package com.breezefsmvenseconnect.features.weather.api

import com.breezefsmvenseconnect.base.BaseResponse
import com.breezefsmvenseconnect.features.task.api.TaskApi
import com.breezefsmvenseconnect.features.task.model.AddTaskInputModel
import com.breezefsmvenseconnect.features.weather.model.ForeCastAPIResponse
import com.breezefsmvenseconnect.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}