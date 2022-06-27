package com.tokyonth.retrofitbaseurl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //伪代码请求
        ApiRepository.api.baidu()

        ApiRepository.api.google()
    }

}
