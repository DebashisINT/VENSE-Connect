package com.breezefsmvenseconnect.features.stockCompetetorStock.api

import com.breezefsmvenseconnect.base.BaseResponse
import com.breezefsmvenseconnect.features.orderList.model.NewOrderListResponseModel
import com.breezefsmvenseconnect.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefsmvenseconnect.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}