package com.timmy.codelab.dikoin

import android.util.Log
import androidx.lifecycle.ViewModel
import com.timmy.codelab.dikoin.provider.ResourceProvider
import com.timmy.codelab.dikoin.repository.MissionRepo
import com.timmy.codelab.dikoin.router.Router

class SecondViewModel(
    private val resourceProvider: ResourceProvider,
    private val router: Router,
    private val missionRepo: MissionRepo
) : ViewModel() {

    private val TAG = this::class.java.simpleName

    init {
        Log.i(TAG, "TimmmmmmY initial: $resourceProvider")
        Log.i(TAG, "TimmmmmmY initial: $router")
        Log.i(TAG, "TimmmmmmY initial: $missionRepo")
    }

    fun showAppDetail() {
        router.showAppDetailSetting()
    }
}