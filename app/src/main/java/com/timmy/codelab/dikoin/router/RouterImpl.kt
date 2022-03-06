package com.timmy.codelab.dikoin.router

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import android.util.Log

class RouterImpl(private val activityProvider: () -> Activity?) : Router {

    private val TAG = this::class.java.simpleName

    init {
        Log.i(TAG, "TimmmmmmY initial.")
    }

    override fun showAppDetailSetting() {
        activityProvider()?.run {
            startActivity(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                data = Uri.parse("package:$packageName")
            })
        }
    }
}