package com.breezefsmvenseconnect.features.myprofile.api.statelist

import com.breezefsmvenseconnect.features.myprofile.model.statelist.StateListApiResponse
import io.reactivex.Observable

/**
 * Created by Pratishruti on 19-02-2018.
 */
class StateListRepo(val apiService: StateListApi)  {
    fun getShopList(): Observable<StateListApiResponse> {
        return apiService.getAllState()
    }
}