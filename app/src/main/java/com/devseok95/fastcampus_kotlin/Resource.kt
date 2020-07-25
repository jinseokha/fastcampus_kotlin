package com.devseok95.fastcampus_kotlin

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_resource.*

class Resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        // 1
        val ment = resources.getString(R.string.hello);
        Log.d("mentt", "ment : " + ment);

        // 2
        val ment2 = getString(R.string.hello)
        Log.d("mentt", "ment2 : " + ment2);

        // minSdk 23 이상 쓸 수 있음
        val color = getColor(R.color.textview_red);
        Log.d("mentt", "color : " + color);

        // SDK 버전에 따른 분기 처리
        val color2 = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getColor(R.color.textview_red);
            button.setBackgroundColor(getColor(R.color.textview_red))
        } else {
            resources.getColor(R.color.textview_red);
            button.setBackgroundColor(resources.getColor(R.color.textview_red))
        }




    }
}