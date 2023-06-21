package com.breezefsmvenseconnect.features.stockAddCurrentStock.api

import com.breezefsmvenseconnect.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefsmvenseconnect.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}