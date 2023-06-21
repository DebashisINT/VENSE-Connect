package com.breezefsmvenseconnect.features.stockAddCurrentStock.api

import com.breezefsmvenseconnect.base.BaseResponse
import com.breezefsmvenseconnect.features.location.model.ShopRevisitStatusRequest
import com.breezefsmvenseconnect.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefsmvenseconnect.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefsmvenseconnect.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefsmvenseconnect.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}