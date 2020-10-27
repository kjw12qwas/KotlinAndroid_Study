package com.example.fastcompus

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_resource.*

class Resource : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        val ment = resources.getString(R.string.hello)
        Log.d("mentt","ment : " + ment)

        val color = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            button.setBackgroundColor(getColor(R.color.colorAccent))

        }else{
            button.setBackgroundColor(resources.getColor(R.color.colorAccent))
        }

    }
}
