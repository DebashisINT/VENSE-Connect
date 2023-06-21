package com.breezefsmvenseconnect.features.viewAllOrder.interf

import com.breezefsmvenseconnect.app.domain.NewOrderGenderEntity
import com.breezefsmvenseconnect.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}