package com.timmy.codelab.dikoin.repository

import android.util.Log
import com.timmy.codelab.dikoin.R
import com.timmy.codelab.dikoin.provider.ResourceProvider

class MissionRepoImpl(private val resourceProvider: ResourceProvider) : MissionRepo {

    private val TAG = this::class.java.simpleName

    init {
        Log.i(TAG, "TimmmmmmY initial: $resourceProvider")
    }

    override fun getMissionName(): String {
        return resourceProvider.getString(R.string.app_name)
    }
}