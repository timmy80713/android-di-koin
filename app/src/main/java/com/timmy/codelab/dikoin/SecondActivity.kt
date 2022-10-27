package com.timmy.codelab.dikoin

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.timmy.codelab.dikoin.arch.ViewBindingActivity
import com.timmy.codelab.dikoin.databinding.ActivitySecondBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondActivity : ViewBindingActivity<ActivitySecondBinding>() {

    private val TAG = this::class.java.simpleName

    private val secondViewModel by viewModel<SecondViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "TimmmmmmY second viewModel: $secondViewModel ")
        viewBinding.second.setOnClickListener {
            secondViewModel.showAppDetail()
        }
    }

    override fun createViewBinding(inflater: LayoutInflater) =
        ActivitySecondBinding.inflate(inflater)
}