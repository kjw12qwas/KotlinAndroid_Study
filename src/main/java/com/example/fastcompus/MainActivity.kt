package com.example.fastcompus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),  FragmentOne.OnDataPassLinster{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentOne: FragmentOne = FragmentOne()
        // 프라그먼트에 data를 넣어주는 방법
        val bundle : Bundle = Bundle()
        bundle.putString("hello", "hello")
        fragmentOne.arguments = bundle

        button.setOnClickListener {
            // 프라그먼트를 동적으로 작동하는 방법
            // 프라그먼트 붙이는 방법 replace/add
            val fragmentManager : FragmentManager = supportFragmentManager

            // Transaction
            // 작업의 단위 -> 시작과 끝이 있다
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragmentOne)
            fragmentTransaction.commit()
            // 끝을 내는 방법
            // commit      -> 시간 될 때 해 ( 좀 더 안정정)
            // commitnow   -> 지금 당장해
        }

        button2.setOnClickListener {
            // 프라그먼트 remove/detach 하는 방법법
           val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.detach(fragmentOne)
            fragmentTransaction.commit()
        }
    }

    override fun onDataPass(data: String?) {
        Log.d("pass",""+data)
    }
}
