package com.timmy.app.dikoin.provider

import android.graphics.drawable.Drawable
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

interface ResourceProvider {
    fun getString(@StringRes stringResId: Int, vararg formatArgs: Any): String

    @ColorInt
    fun getColor(@ColorRes colorResId: Int): Int

    fun getDrawable(@DrawableRes drawable: Int): Drawable?
}