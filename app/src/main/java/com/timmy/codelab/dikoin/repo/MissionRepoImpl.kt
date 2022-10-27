package com.timmy.codelab.dikoin.repo

import android.util.Log
import com.timmy.codelab.dikoin.R
import com.timmy.codelab.dikoin.provider.ResourceProvider
import org.koin.core.annotation.Factory

@Factory
class MissionRepoImpl(private val resourceProvider: ResourceProvider) : MissionRepo {

    private val TAG = this::class.java.simpleName

    init {
        Log.i(TAG, "TimmmmmmY initial: $resourceProvider")
    }

    override fun getMissionName(): String {
        return resourceProvider.getString(R.string.app_name)
    }
}