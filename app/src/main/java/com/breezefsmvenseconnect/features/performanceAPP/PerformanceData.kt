package com.breezefsmvenseconnect.features.performanceAPP

import com.breezefsmvenseconnect.features.orderList.model.NewProductListDataModel


data class NoOrderTakenShop(var shop_id:String="",var shop_name:String="",var owner_contact_number:String="",var address:String="",var owner_name:String=""
,var type:String="")

data class NoProductSoldShop(var product_name:String="")

data class OrderProductListForTeam(var order_id:String="",var product_name:String="")


data class NoOrderTakenList(var shop_id:String="",var shop_name:String="",var owner_contact_number:String="",var address:String="",var owner_name:String=""
                            ,var type:String="",var age_since_party_creation_count:String="")

data class ShopDtlsCustom(var shop_id:String="",var shop_name:String="",var owner_contact_number:String="",var address:String="",var owner_name:String=""
                          ,var type:String="",var age_since_party_creation_count:String="",var dateAdded:String = "",var lastVisitedDate:String="")

