package com.timmy.codelab.dikoin.di

import com.timmy.codelab.dikoin.repository.MissionRepo
import com.timmy.codelab.dikoin.repository.MissionRepoImpl
import org.koin.dsl.module

val repositoryModule = module {
    factory<MissionRepo> {
        MissionRepoImpl(
            resourceProvider = get()
        )
    }
}