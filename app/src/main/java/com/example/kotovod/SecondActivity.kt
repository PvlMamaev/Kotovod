package com.example.kotovod

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.RadioGroup

class SecondActivity : Activity() {

    companion object {
        const val THIEF = "com.example.kotovod.SecondActivity"
        // даем название ключу чтобы передать значение которое выбрал пользователь
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)

        radioGroup.setOnCheckedChangeListener { _, optionId ->
                    // тут я не понял что такое "_" и "optionId"
            val answerIntent = Intent() // интент для передачи результата
            when (optionId) { // если...
                R.id.radio_dog -> answerIntent.putExtra(THIEF, "Сраный песик")
                R.id.radio_crow -> answerIntent.putExtra(THIEF, "Сраная ворона")
                R.id.radio_cat -> answerIntent.putExtra(THIEF, "Лошадь Пржевальского")
            }

            setResult(RESULT_OK, answerIntent)
            finish()
        }
    }
}