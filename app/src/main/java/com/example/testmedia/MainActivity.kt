package com.example.testmedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testmedia.databinding.ActivityMainBinding
import com.example.testmedia.databinding.FragmentAnalyzBinding

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttomNavigation.setOnItemSelectedListener {


            when (it.itemId) {

                R.id.anaLyz -> {

                    supportFragmentManager.beginTransaction().replace(binding.fraGment.id, AnalyzFragment()).commit()

                }

                R.id.reSult -> {

                    supportFragmentManager.beginTransaction().replace(binding.fraGment.id, ResultFragment()).commit()

                }

                R.id.suPport -> {

                    supportFragmentManager.beginTransaction().replace(binding.fraGment.id, SuppFragment()).commit()

                }

                R.id.uSer -> {

                    supportFragmentManager.beginTransaction().replace(binding.fraGment.id, UserFragment()).commit()

                }
            }
            true
        }

    }
}