package com.devseok95.fastcampus_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.devseok95.fastcampus_kotlin.Kotlin.number
import kotlinx.android.synthetic.main.activity_listener.*

class Listener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

        //var textView: TextView = findViewById(R.id.tv_hello);

        var number = 10

        // 뷰를 activity로 가져오는 방법
         // > xml을 import해서 가져온다
        //tv_hello.

        // 람다방식
        tv_hello.setOnClickListener {
            Log.d("click", "Click!!")

        }

        // 익명 함수 방식
        tv_hello.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                TODO("Not yet implemented")
                Log.d("click", "Click!!")
            }
        })
        // 3 -> 이름이 필요한 경우 (click)
        val click = object: View.OnClickListener {
            override fun onClick(v: View?) {
                TODO("Not yet implemented")
                Log.d("click", "Click!!")
                tv_hello.setText("change Click")
                img.setImageResource(R.drawable.boy)
                number += 10

                Log.d("number", "" + number)
            }
        }

        // 마지막에 적용한 것이 실행함
        tv_hello.setOnClickListener(click)

        // 뷰를 조작하는 함수들
        // 1 > setText
        // 2 > setImageResource
        

    }
}