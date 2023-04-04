package com.example.testmedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)


        var handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, OnBording::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}