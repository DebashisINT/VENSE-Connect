package com.breezefsmvenseconnect.features.viewAllOrder.orderOptimized

import com.breezefsmvenseconnect.app.domain.ProductOnlineRateTempEntity
import com.breezefsmvenseconnect.base.BaseResponse
import com.breezefsmvenseconnect.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}