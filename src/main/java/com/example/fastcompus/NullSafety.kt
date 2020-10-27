package com.example.fastcompus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NullSafety : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        val number : Int = 10
        val number1 : Int? = null

        
    }
}
