package com.example.myassistantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler




class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var intent = Intent(this,MainActivity::class.java)

        startActivity(intent)
//        Handler().postDelayed(Runnable {
//
//
//
//        },2000)
    }
}