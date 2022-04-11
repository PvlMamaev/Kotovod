package com.example.kotovod

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : Activity() { // но если там будет стоять AppCompatActivity() то 23 строка перестанет работать

    companion object{
        const val REQUEST_CHOOSE_THIEF = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_choose = findViewById<Button>(R.id.button_choose)

        button_choose.setOnClickListener {
            val questionIntent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivityForResult(questionIntent, REQUEST_CHOOSE_THIEF) // работает только если наследовать класс от AppCompatActivity()
        }

    }
}