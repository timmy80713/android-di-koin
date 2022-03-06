package com.timmy.codelab.dikoin.di

import com.timmy.codelab.dikoin.provider.ResourceProvider
import com.timmy.codelab.dikoin.provider.ResourceProviderImpl
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val providerModule = module {
    single<ResourceProvider> {
        ResourceProviderImpl(
            context = androidApplication()
        )
    }
}