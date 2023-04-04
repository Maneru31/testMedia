package com.example.testmedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.example.testmedia.databinding.ActivityMainBinding
import com.example.testmedia.databinding.ActivityOnBordingBinding

class OnBording : AppCompatActivity() {

    lateinit var binding: ActivityOnBordingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBordingBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.skiP.setOnClickListener{
            val intent = Intent(this, ActivityMainBinding::class.java)
            startActivity(Intent())
        }



        val dataList = arrayListOf(
            DataModel(
                "Анализы",
                "Экспресс сбор и получение проб",
                R.drawable.illustration
            ),
            DataModel("Уведомления", "Вы быстро узнаете о результатах", R.drawable.snim),
            DataModel(
                "Мониторинг",
                "Наши врачи всегда наблюдают\n за вашими показателями здоровья",
                R.drawable.moni
            )

        )

        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.viewPager.adapter = OnBoardApater(this, dataList)





        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {

                super.onPageSelected(position)
                if (position == 0) {
                    binding.firstPossition.visibility = View.VISIBLE
                    binding.secondPossition.visibility = View.GONE
                    binding.firstPossition.rotation = 360f
                    binding.skiP.setText("Пропустить")

                } else if (position == 1) {
                    binding.firstPossition.visibility = View.GONE
                    binding.secondPossition.visibility = View.VISIBLE
                    binding.skiP.setText("Пропустить")

                } else if (position == 2) {
                    binding.firstPossition.visibility = View.VISIBLE
                    binding.secondPossition.visibility = View.GONE
                    binding.firstPossition.rotation = 180F
                    binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
                    binding.skiP.setText("Завершить")

                }

            }

        })




    }
}