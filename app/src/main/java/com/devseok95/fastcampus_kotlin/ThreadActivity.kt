package com.devseok95.fastcampus_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_thread.*

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)

        val runnable: Runnable = object : Runnable {
            override fun run() {
                Log.d("test", "Thread is made1")
            }
        }

        val thread: Thread = Thread(runnable)

        button.setOnClickListener {
            thread.start()
        }

        Thread(object : Runnable {
            override fun run() {
                Log.d("test", "Thread is made2")
            }
        }).start()

        Thread(Runnable {
            Thread.sleep(2000)
            Log.d("test", "Thread is made3")
            runOnUiThread {
                button.setBackgroundColor(getColor(R.color.textview_red))
            }
        }).start()


    }
}