package com.example.kotovod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Kakoeto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kakoeto)

        val textview_second_info = findViewById<TextView>(R.id.textview_second_info)
        val editText_second = findViewById<EditText>(R.id.editText_second)
        val button_second = findViewById<Button>(R.id.button_second)
        var user = "ЖЫвотное"
        var gift = "Дырку от бублика"

        user = intent.getStringExtra("username")!!
        gift = intent.extras!!.getString("gift")!!

        textview_second_info.text = user + " , вам передали " + gift
        // editText_second.text = user + " , вам передали " + gift - не работает

        button_second.setOnClickListener {
            finish()
        }

    }
}