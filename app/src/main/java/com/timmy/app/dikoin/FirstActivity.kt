package com.timmy.app.dikoin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.timmy.app.dikoin.provider.ResourceProvider
import com.timmy.app.dikoin.repository.MissionRepo
import com.timmy.app.dikoin.router.Router
import kotlinx.android.synthetic.main.activity_first.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class FirstActivity : AppCompatActivity() {

    private val TAG = this::class.java.simpleName

    private val router: Router by inject { parametersOf(this) }
    private val resourceProvider: ResourceProvider by inject()
    private val missionRepo: MissionRepo by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        Log.i(TAG, " timmmmmmy router : $router ")
        Log.i(TAG, " timmmmmmy resourceProvider : $resourceProvider ")
        Log.i(TAG, " timmmmmmy missionRepo : $missionRepo ")
        first.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
