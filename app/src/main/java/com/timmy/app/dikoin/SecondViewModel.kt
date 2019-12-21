package com.timmy.app.dikoin

import android.util.Log
import androidx.lifecycle.ViewModel
import com.timmy.app.dikoin.provider.ResourceProvider
import com.timmy.app.dikoin.repository.MissionRepo
import com.timmy.app.dikoin.router.Router

class SecondViewModel(
        resourceProvider: ResourceProvider,
        router: Router,
        missionRepo: MissionRepo) : ViewModel() {

    private val TAG = this::class.java.simpleName

    init {
        Log.i(TAG, " timmmmmmy initial : $resourceProvider")
        Log.i(TAG, " timmmmmmy initial : $router")
        Log.i(TAG, " timmmmmmy initial : $missionRepo")
    }
}