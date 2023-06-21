package com.breezefsmvenseconnect.features.newcollectionreport

import com.breezefsmvenseconnect.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}