package com.breezefsmvenseconnect.features.viewAllOrder.interf

import com.breezefsmvenseconnect.app.domain.NewOrderColorEntity
import com.breezefsmvenseconnect.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}