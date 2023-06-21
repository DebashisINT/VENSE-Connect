package com.breezefsmvenseconnect.features.document.api

import com.breezefsmvenseconnect.features.dymanicSection.api.DynamicApi
import com.breezefsmvenseconnect.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}