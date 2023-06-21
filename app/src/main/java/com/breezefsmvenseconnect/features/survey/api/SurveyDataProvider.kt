package com.breezefsmvenseconnect.features.survey.api

import com.breezefsmvenseconnect.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefsmvenseconnect.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}