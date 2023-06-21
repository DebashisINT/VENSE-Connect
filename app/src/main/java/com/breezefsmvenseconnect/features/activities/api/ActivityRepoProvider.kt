package com.breezefsmvenseconnect.features.activities.api

import com.breezefsmvenseconnect.features.member.api.TeamApi
import com.breezefsmvenseconnect.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}