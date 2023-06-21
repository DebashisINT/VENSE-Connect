package com.breezefsmvenseconnect.features.orderList.model

import com.breezefsmvenseconnect.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}