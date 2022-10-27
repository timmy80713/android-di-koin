package com.timmy.codelab.dikoin.provider

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.Log
import androidx.core.content.ContextCompat
import org.koin.core.annotation.Single

@Single
class ResourceProviderImpl(context: Context) : ResourceProvider {

    private val TAG = this::class.java.simpleName

    init {
        Log.i(TAG, "TimmmmmmY initial.")
    }

    private val appContext: Context = context.applicationContext

    override fun getString(stringResId: Int, vararg formatArgs: Any): String {
        return appContext.getString(stringResId, *formatArgs)
    }

    override fun getColor(colorResId: Int): Int {
        return ContextCompat.getColor(appContext, colorResId)
    }

    override fun getDrawable(drawable: Int): Drawable? {
        return ContextCompat.getDrawable(appContext, drawable)
    }
}