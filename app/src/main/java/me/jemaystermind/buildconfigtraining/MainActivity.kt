package me.jemaystermind.buildconfigtraining

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import me.jemaystermind.service.ApiService

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service: ApiService = ApiServiceFactory.service()
        Log.i("MainActivity", "Users= ${service.users()}")

        hello.text = service.users().toString()
    }
}
