package com.example.kotovod

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : Activity() {

    companion object{
        const val REQUEST_CHOOSE_THIEF = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_choose)

        button.setOnClickListener {
            val i = Intent(this@MainActivity, SecondActivity::class.java)
            startActivityForResult(i, REQUEST_CHOOSE_THIEF)
        }
    }

    override fun startActivityForResult(intent: Intent?, requestCode: Int) {
        super.startActivityForResult(intent, requestCode)

        if (requestCode == REQUEST_CHOOSE_THIEF) {
            if (requestCode == Activity.RESULT_OK){
                val thiefName = data
            }
        }

    }
}