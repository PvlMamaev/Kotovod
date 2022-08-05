package com.example.kotovod

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomRecyclerAdapter(private val names: List<String>) :
    RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>() {

    // Класс MyViewHolder на основе ViewHolder служит своеобразным контейнером для всех компонентов,
    // которые входят в элемент списка
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // В скобках указываем название для элемента списка на основе View
        // и этот же параметр указываем и для RecycleView.ViewHolder
        val largeTextView: TextView = itemView.findViewById(R.id.textViewLarge)
        val smallTextView: TextView = itemView.findViewById(R.id.textViewSmall)
    }

    // Создадим адаптер - наследуем наш класс от класса RecyclerView.Adapter
    // и в качестве параметра указываем созданный нами MyViewHolder. Студия попросит реализовать три метода
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recyclerview_item, parent, false)

        return MyViewHolder(itemView)
        // Нам нужно указать идентификатор макета для отдельного элемента списка, созданный нами
        // ранее в файле recyclerview_item.xml. А также вернуть наш объект класса ViewHolder.
        // Допустим, устройство может отобразить на экране 9 элементов списка. RecyclerView создаст
        // 11-12 элементов (с запасом). Неважно, каким большим будет ваш список, но все данные будут
        // размещаться в тех же 11 элементах, автоматически меняя содержимое при прокрутке.
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.largeTextView.text = names[position]
        holder.smallTextView.text = "кот"
        // В методе адаптера onBindViewHolder() связываем используемые текстовые метки с данными
        // - в одном случае это значения из списка, во втором используется одна и та же строка.
        // Параметр position отвечает за позицию в списке (индекс), по которой можно получить нужные данные.
    }

    override fun getItemCount(): Int {
        return names.size
        // Возвращает количество элементов списка. Как правило данные являются однотипными, например,
        // список или массив строк. Адаптеру нужно знать, сколько элементов нужно предоставить
        // компоненту, чтобы распределить ресурсы и подготовиться к отображению на экране.
        // При работе с коллекциями или массивом мы можем просто вычислить его длину и передать это
        // значение методу адаптера getItemCount()
    }


}