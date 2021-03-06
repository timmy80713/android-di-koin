package com.timmy.app.dikoin

import android.app.Application
import com.timmy.app.dikoin.di.providerModule
import com.timmy.app.dikoin.di.repositoryModule
import com.timmy.app.dikoin.di.routerModule
import com.timmy.app.dikoin.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.module.Module

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MyApp)
            modules(mutableListOf<Module>().apply {
                add(providerModule)
                add(repositoryModule)
                add(routerModule)
                add(viewModelModule)
            })
        }
    }
}