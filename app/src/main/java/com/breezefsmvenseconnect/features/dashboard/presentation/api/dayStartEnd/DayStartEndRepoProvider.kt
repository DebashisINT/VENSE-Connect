package com.breezefsmvenseconnect.features.dashboard.presentation.api.dayStartEnd

import com.breezefsmvenseconnect.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefsmvenseconnect.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}