package com.example.dimalearnsandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dimalearnsandroid.databinding.View2Binding


class RecViewAdapter() : RecyclerView.Adapter<ViewHolder>() {

    var data: Array<Int> = emptyArray()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.view_2, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemData = data[position]
        holder.updateData(itemData)
    }

    override fun getItemCount(): Int = data.size


}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun updateData(data1: Int) {
        View2Binding.bind(itemView).textView.text = data1.toString()
        // fill view
    }
}