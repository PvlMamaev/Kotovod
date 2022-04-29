package com.example.kotovod

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val text = "Пора покормить кота!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER, 0, 0)
        val button = findViewById<Button>(R.id.button)
        val toastContainer = toast.view as LinearLayout
        val catImage = ImageView(this)
        catImage.setImageResource(R.drawable.cat)
        toastContainer.addView(catImage, 0)
        toastContainer.setBackgroundColor(Color.TRANSPARENT)

        button.setOnClickListener {
            toast.show()
        }
    }
}