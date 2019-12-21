package com.timmy.app.dikoin.repository

import android.util.Log
import com.timmy.app.dikoin.R
import com.timmy.app.dikoin.provider.ResourceProvider

class MissionRepoImpl(val resourceProvider: ResourceProvider) : MissionRepo {

    private val TAG = this::class.java.simpleName

    init {
        Log.i(TAG, " timmmmmmy initial : $resourceProvider")
    }

    override fun getMissionName(): String {
        return resourceProvider.getString(R.string.app_name)
    }
}