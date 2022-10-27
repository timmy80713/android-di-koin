package com.timmy.codelab.dikoin.router

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import android.util.Log
import org.koin.core.annotation.Factory

@Factory
class RouterImpl(context: Context) : Router {

    private val TAG = this::class.java.simpleName

    init {
        Log.i(TAG, "TimmmmmmY initial.")
    }

    private val appContext: Context = context.applicationContext

    override fun showAppDetailSetting() {
        appContext.run {
            startActivity(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                data = Uri.parse("package:$packageName")
            })
        }
    }
}