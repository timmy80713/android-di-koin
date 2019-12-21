package com.timmy.app.dikoin.di

import android.app.Activity
import com.timmy.app.dikoin.router.Router
import com.timmy.app.dikoin.router.RouterImpl
import org.koin.dsl.module

/**
 * RouterImpl constructor needs [Activity]. Only [Activity] has [Activity.startActivityForResult].
 * Don't declare singleton, it will occur memory leak.
 */
val routerModule = module {
    factory<Router> { (activity: Activity) -> RouterImpl(activity) }
}