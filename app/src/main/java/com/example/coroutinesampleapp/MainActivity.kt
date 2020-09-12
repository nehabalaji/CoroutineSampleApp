package com.example.coroutinesampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val TAG = "MAIN"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            val answer = networkCallAnswer()
            Log.v(TAG, answer)
        }
    }

    suspend fun networkCallAnswer(): String{
        delay(3000L)
        return "This is the answer"
    }
}