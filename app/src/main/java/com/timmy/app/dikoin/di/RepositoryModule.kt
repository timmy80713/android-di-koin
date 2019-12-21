package com.timmy.app.dikoin.di

import com.timmy.app.dikoin.repository.MissionRepo
import com.timmy.app.dikoin.repository.MissionRepoImpl
import org.koin.dsl.module

val repositoryModule = module {
    factory<MissionRepo> { MissionRepoImpl(get()) }
}