package com.timmy.app.dikoin.router

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import android.util.Log

class RouterImpl(private val activity: Activity) : Router {

    private val TAG = this::class.java.simpleName

    init {
        Log.i(TAG, " timmmmmmy initial ")
    }


    override fun showAppDetailSetting() {
        activity.startActivity(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
            data = Uri.parse("package:" + activity.packageName)
        })
    }
}