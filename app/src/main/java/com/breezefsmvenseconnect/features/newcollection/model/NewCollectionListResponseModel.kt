package com.breezefsmvenseconnect.features.newcollection.model

import com.breezefsmvenseconnect.app.domain.CollectionDetailsEntity
import com.breezefsmvenseconnect.base.BaseResponse
import com.breezefsmvenseconnect.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}