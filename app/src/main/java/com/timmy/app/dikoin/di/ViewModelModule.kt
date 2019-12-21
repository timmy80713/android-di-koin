package com.timmy.app.dikoin.di

import android.app.Activity
import com.timmy.app.dikoin.SecondViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.parameter.parametersOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { (activity: Activity) -> SecondViewModel(get(), get { parametersOf(activity) }, get()) }
}