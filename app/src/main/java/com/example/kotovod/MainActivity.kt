package com.example.kotovod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText_komy = findViewById<EditText>(R.id.editText_komy)
        val editText_opisanie = findViewById<EditText>(R.id.editText_opisanie)
        val button = findViewById<Button>(R.id.button_send)

        button.setOnClickListener {
            val intent = Intent(this, Kakoeto::class.java)
            intent.putExtra("username", editText_komy.text.toString())
            intent.putExtra("gift", editText_opisanie.text.toString())
            startActivity(intent)
        }

    }
}