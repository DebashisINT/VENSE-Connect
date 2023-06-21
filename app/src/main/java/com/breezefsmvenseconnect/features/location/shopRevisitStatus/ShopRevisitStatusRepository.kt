package com.breezefsmvenseconnect.features.location.shopRevisitStatus

import com.breezefsmvenseconnect.base.BaseResponse
import com.breezefsmvenseconnect.features.location.model.ShopDurationRequest
import com.breezefsmvenseconnect.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}