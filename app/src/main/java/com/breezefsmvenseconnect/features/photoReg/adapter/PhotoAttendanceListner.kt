package com.breezefsmvenseconnect.features.photoReg.adapter

import com.breezefsmvenseconnect.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}