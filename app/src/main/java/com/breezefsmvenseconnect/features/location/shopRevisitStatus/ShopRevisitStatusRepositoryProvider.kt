package com.breezefsmvenseconnect.features.location.shopRevisitStatus

import com.breezefsmvenseconnect.features.location.shopdurationapi.ShopDurationApi
import com.breezefsmvenseconnect.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}