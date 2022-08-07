package com.example.kotovod

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomRecyclerView(private val name: List<String>) :
    RecyclerView.Adapter<CustomRecyclerView.MyHolderView>() {
    class MyHolderView(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val largeTextView: TextView = itemView.findViewById(R.id.textViewLarge)
        val smallTextView: TextView = itemView.findViewById(R.id.textViewSmall)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolderView {
        val viewHolder =
            LayoutInflater.from(parent.context).inflate(R.layout.recycleview_item, parent, false)
        return MyHolderView(viewHolder)
    }

    override fun onBindViewHolder(holder: MyHolderView, position: Int) {
        holder.largeTextView.text = name[position]
        holder.smallTextView.text = "Kit"
    }

    override fun getItemCount(): Int = name.size
}