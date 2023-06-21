package com.breezefsmvenseconnect.features.photoReg.present

import com.breezefsmvenseconnect.app.domain.ProspectEntity
import com.breezefsmvenseconnect.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}