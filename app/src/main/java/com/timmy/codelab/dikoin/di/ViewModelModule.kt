package com.timmy.codelab.dikoin.di

import com.timmy.codelab.dikoin.SecondViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.parameter.parametersOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { parameters ->
        SecondViewModel(
            resourceProvider = get(),
            router = get { parametersOf(parameters.get()) },
            missionRepo = get()
        )
    }
}