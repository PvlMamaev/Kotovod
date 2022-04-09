package com.example.kotovod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        // Для запуска нового экрана необходимо создать экземпляр класса Intent
        // и указать в первом параметре текущий класс, а во втором - класс для перехода, у нас это com.example.kotovod.AboutActivity
        }

        val button_second = findViewById<Button>(R.id.button_second)
        button_second.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}