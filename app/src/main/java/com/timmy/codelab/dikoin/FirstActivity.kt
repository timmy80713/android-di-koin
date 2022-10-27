package com.timmy.codelab.dikoin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.timmy.codelab.dikoin.arch.ViewBindingActivity
import com.timmy.codelab.dikoin.databinding.ActivityFirstBinding
import com.timmy.codelab.dikoin.provider.ResourceProvider
import com.timmy.codelab.dikoin.repo.MissionRepo
import com.timmy.codelab.dikoin.router.Router
import org.koin.android.ext.android.inject

class FirstActivity : ViewBindingActivity<ActivityFirstBinding>() {

    private val TAG = this::class.java.simpleName

    private val router by inject<Router>()
    private val resourceProvider by inject<ResourceProvider>()
    private val missionRepo by inject<MissionRepo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "TimmmmmmY missionRepo: $missionRepo")
        Log.i(TAG, "TimmmmmmY resourceProvider: $resourceProvider")
        Log.i(TAG, "TimmmmmmY router: $router")
        viewBinding.first.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

    override fun createViewBinding(inflater: LayoutInflater) =
        ActivityFirstBinding.inflate(inflater)
}