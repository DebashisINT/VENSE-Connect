package com.breezefsmvenseconnect.features.nearbyuserlist.api

import com.breezefsmvenseconnect.app.Pref
import com.breezefsmvenseconnect.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefsmvenseconnect.features.newcollection.model.NewCollectionListResponseModel
import com.breezefsmvenseconnect.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}