package com.example.kotovod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView) // ссылка на объект
        recyclerView.layoutManager = LinearLayoutManager(this) // хз
//        recyclerView.adapter = CustomRecyclerAdapter(fillList()) // хз
        recyclerView.adapter = CustomRecyclerAdapter(getCatList())
    }

    private fun fillList(): List<String> { // функция создания списка
        val data = mutableListOf<String>()
        (0..30).forEach { i -> data.add("$i element") }
        return data
    }

    private fun getCatList(): List<String> {
        return this.resources.getStringArray(R.array.cat_names).toList()
    }
}