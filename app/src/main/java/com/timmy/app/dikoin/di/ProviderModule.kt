package com.timmy.app.dikoin.di

import com.timmy.app.dikoin.provider.ResourceProvider
import com.timmy.app.dikoin.provider.ResourceProviderImpl
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val providerModule = module {
    single<ResourceProvider> { ResourceProviderImpl(androidApplication()) }
}