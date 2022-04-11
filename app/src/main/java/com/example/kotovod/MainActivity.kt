package com.example.kotovod

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity :
    Activity() { // но если там будет стоять AppCompatActivity() то 25 строка перестанет работать

    companion object {
        const val REQUEST_CHOOSE_THIEF = 0
        const val THIEF = "com.example.kotovod.SecondActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button_choose = findViewById<Button>(R.id.button_choose)

        button_choose.setOnClickListener {
            val questionIntent = Intent(this@MainActivity, SecondActivity::class.java)
            // создаем интент в котором будет содержаться информация о выборе
            startActivityForResult(questionIntent, REQUEST_CHOOSE_THIEF)
            // работает только если наследовать класс от AppCompatActivity()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val textview_info = findViewById<TextView>(R.id.textview_info)

        if (requestCode == REQUEST_CHOOSE_THIEF) {
            if (resultCode == Activity.RESULT_OK) {
                val thiefName = data?.getStringExtra(THIEF)
                textview_info.text = thiefName
            } else {
                textview_info.text = ""
            }
        }
    }
}