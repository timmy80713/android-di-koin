package com.timmy.codelab.dikoin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.timmy.codelab.dikoin.arch.ViewBindingActivity
import com.timmy.codelab.dikoin.databinding.ActivityFirstBinding
import com.timmy.codelab.dikoin.provider.ResourceProvider
import com.timmy.codelab.dikoin.repository.MissionRepo
import com.timmy.codelab.dikoin.router.Router
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class FirstActivity : ViewBindingActivity<ActivityFirstBinding>() {

    private val TAG = this::class.java.simpleName

    private val router: Router by inject { parametersOf({ this }) }
    private val resourceProvider: ResourceProvider by inject()
    private val missionRepo: MissionRepo by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "TimmmmmmY router: $router")
        Log.i(TAG, "TimmmmmmY resourceProvider: $resourceProvider")
        Log.i(TAG, "TimmmmmmY missionRepo: $missionRepo")
        viewBinding.first.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

    override fun createViewBinding(inflater: LayoutInflater) =
        ActivityFirstBinding.inflate(inflater)
}