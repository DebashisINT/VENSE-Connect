package com.breezefsmvenseconnect.features.beatCustom.api



object GetBeatRegProvider {

    fun provideSaveButton(): GetBeatListRegRepository {
        return GetBeatListRegRepository(GetBeatProductListApi.create())
    }


}