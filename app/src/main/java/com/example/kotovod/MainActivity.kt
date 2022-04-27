package com.example.kotovod

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landscape)

        fun getStringOrientation (): String {
            return when (resources.configuration.orientation){
                Configuration.ORIENTATION_LANDSCAPE -> "Альбомная ориентация"
                Configuration.ORIENTATION_PORTRAIT -> "Портретная ориентация"
                else -> ""
            }
        }

        val button1 = findViewById<Button>(R.id.button1)
        val editText = findViewById<EditText>(R.id.editText)

        button1.setOnClickListener {
            // editText.text = getStringOrientation() а чо нельзя???
            // а вот нельзя, используй setText( "text" )
            editText.setText(getStringOrientation())
        }
    }




}