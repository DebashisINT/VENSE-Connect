package com.breezefsmvenseconnect.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefsmvenseconnect.app.FileUtils
import com.breezefsmvenseconnect.base.BaseResponse
import com.breezefsmvenseconnect.features.NewQuotation.model.*
import com.breezefsmvenseconnect.features.addshop.model.AddShopRequestData
import com.breezefsmvenseconnect.features.addshop.model.AddShopResponse
import com.breezefsmvenseconnect.features.damageProduct.model.DamageProductResponseModel
import com.breezefsmvenseconnect.features.damageProduct.model.delBreakageReq
import com.breezefsmvenseconnect.features.damageProduct.model.viewAllBreakageReq
import com.breezefsmvenseconnect.features.login.model.userconfig.UserConfigResponseModel
import com.breezefsmvenseconnect.features.myjobs.model.WIPImageSubmit
import com.breezefsmvenseconnect.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}