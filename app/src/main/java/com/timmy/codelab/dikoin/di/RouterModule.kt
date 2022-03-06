package com.timmy.codelab.dikoin.di

import com.timmy.codelab.dikoin.router.Router
import com.timmy.codelab.dikoin.router.RouterImpl
import org.koin.dsl.module

val routerModule = module {
    factory<Router> { parameters ->
        RouterImpl(
            activityProvider = parameters.get()
        )
    }
}