package com.breezefsmvenseconnect.features.viewAllOrder.model

import com.breezefsmvenseconnect.app.domain.NewOrderColorEntity
import com.breezefsmvenseconnect.app.domain.NewOrderGenderEntity
import com.breezefsmvenseconnect.app.domain.NewOrderProductEntity
import com.breezefsmvenseconnect.app.domain.NewOrderSizeEntity
import com.breezefsmvenseconnect.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

