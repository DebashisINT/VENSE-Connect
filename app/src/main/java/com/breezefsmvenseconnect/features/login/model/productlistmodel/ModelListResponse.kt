package com.breezefsmvenseconnect.features.login.model.productlistmodel

import com.breezefsmvenseconnect.app.domain.ModelEntity
import com.breezefsmvenseconnect.app.domain.ProductListEntity
import com.breezefsmvenseconnect.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}