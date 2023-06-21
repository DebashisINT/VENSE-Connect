package com.breezefsmvenseconnect.features.lead.api

import com.breezefsmvenseconnect.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefsmvenseconnect.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}