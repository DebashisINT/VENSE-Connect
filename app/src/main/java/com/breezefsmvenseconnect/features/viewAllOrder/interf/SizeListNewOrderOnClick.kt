package com.breezefsmvenseconnect.features.viewAllOrder.interf

import com.breezefsmvenseconnect.app.domain.NewOrderProductEntity
import com.breezefsmvenseconnect.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}