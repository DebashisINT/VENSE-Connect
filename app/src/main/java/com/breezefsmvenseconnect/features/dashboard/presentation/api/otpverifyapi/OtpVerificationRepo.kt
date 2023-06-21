package com.breezefsmvenseconnect.features.dashboard.presentation.api.otpverifyapi

import com.breezefsmvenseconnect.app.Pref
import com.breezefsmvenseconnect.base.BaseResponse
import io.reactivex.Observable

/**
 * Created by Saikat on 22-11-2018.
 */
class OtpVerificationRepo(val apiService: OtpVerificationApi) {
    fun otpVerify(shopId: String, otp: String): Observable<BaseResponse> {
        return apiService.otpVerify(Pref.session_token!!, Pref.user_id!!, shopId, otp)
    }
}