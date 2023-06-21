package com.breezefsmvenseconnect.features.newcollection.newcollectionlistapi

import com.breezefsmvenseconnect.app.Pref
import com.breezefsmvenseconnect.features.newcollection.model.CollectionDetailsResponseModel
import com.breezefsmvenseconnect.features.newcollection.model.CollectionShopListResponseModel
import com.breezefsmvenseconnect.features.newcollection.model.NewCollectionListResponseModel
import com.breezefsmvenseconnect.features.newcollection.model.PaymentModeResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListRepo(val apiService: NewCollectionListApi) {
    fun collectionList(session_token: String, user_id: String, date: String): Observable<NewCollectionListResponseModel> {
        return apiService.newCollectionList(session_token, user_id, date)
    }

    fun collectionDetails(): Observable<CollectionDetailsResponseModel> {
        return apiService.newCollectionDetails(Pref.session_token!!, Pref.user_id!!)
    }

    fun collectionShopList(date: String): Observable<CollectionShopListResponseModel> {
        return apiService.newCollectionShopList(Pref.session_token!!, Pref.user_id!!, date)
    }

    fun paymentModeList(): Observable<PaymentModeResponseModel> {
        return apiService.paymentModeList(Pref.session_token!!, Pref.user_id!!)
    }
}