package com.example.kotovod

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter: Int = 0
    var counter_cats: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linlay)

        val textView = findViewById<TextView>(R.id.textview_main)
        val button = findViewById<Button>(R.id.button_Privetstvie)
        val button_counter_birds = findViewById<Button>(R.id.button_count_bird)
        val button_count_cats = findViewById<Button>(R.id.button_count_cats)

        button.setOnClickListener {
            textView.text = "Hello Kitty!" // что он от меня хочет ?!
            it.setBackgroundColor(Color.BLUE) // it - обращение к самой кнопке
            counter = 0
            counter_cats = 0
        }

        button_counter_birds.setOnClickListener {
            textView.text = "Я насчитал ${++counter} ворон" // если поменять местами ++, то отсчет начнется с 0
        }

        button_count_cats.setOnClickListener {
            textView.text = "Я насчитал ${++counter_cats} котиков"
            button_count_cats.setBackgroundColor(Color.GRAY)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val textView = findViewById<TextView>(R.id.textview_main)

        outState.putString("KEY_TEXT", textView.text.toString())
        outState.putInt("KEY_COUNT", counter)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        val textView = findViewById<TextView>(R.id.textview_main)

        textView.text = savedInstanceState.getString("KEY_TEXT")
        counter = savedInstanceState.getInt("KEY_COUNT")
    }
}