package com.breezefsmvenseconnect.features.viewAllOrder.interf

import com.breezefsmvenseconnect.app.domain.NewOrderGenderEntity
import com.breezefsmvenseconnect.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}