package com.breezefsmvenseconnect.features.orderhistory.model

import com.breezefsmvenseconnect.base.BaseResponse

/**
 * Created by Pratishruti on 30-11-2017.
 */
class FetchLocationResponse:BaseResponse(){
    var location_details:List<LocationData>?=null
    var visit_distance = ""
}