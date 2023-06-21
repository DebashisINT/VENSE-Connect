package com.breezefsmvenseconnect.features.viewAllOrder.interf

import com.breezefsmvenseconnect.app.domain.NewOrderGenderEntity
import com.breezefsmvenseconnect.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}