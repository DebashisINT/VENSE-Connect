package com.breezefsmvenseconnect.features.location.api

import com.breezefsmvenseconnect.features.location.shopdurationapi.ShopDurationApi
import com.breezefsmvenseconnect.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}