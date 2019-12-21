package com.timmy.app.dikoin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class SecondActivity : AppCompatActivity() {

    private val TAG = this::class.java.simpleName

    private val secondViewModel: SecondViewModel by viewModel { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i(TAG, " timmmmmmy secondViewModel : $secondViewModel ")
    }
}
