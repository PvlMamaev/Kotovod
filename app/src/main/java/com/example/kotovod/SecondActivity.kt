package com.example.kotovod

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.RadioGroup

class SecondActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val radio = findViewById<RadioGroup>(R.id.radio_group)

        radio.setOnCheckedChangeListener { _, optiond ->
            val answerIntent = Intent()
            when(optiond){
                R.id.radio_crow -> answerIntent.putExtra("polojenni", "Это ворона")
                R.id.radio_dog -> answerIntent.putExtra("polojenni", "Это пес")
                R.id.radio_cat -> answerIntent.putExtra("polojenni", "Это кот Васька")
            }
            setResult(RESULT_OK, answerIntent)
        }
    }
}