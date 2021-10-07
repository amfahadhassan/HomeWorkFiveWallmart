package com.example.homeworkfivewallmart

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(
    private val dataSet: ArrayList<Products>,
    private val listener: OnItemClickListener) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {

        var  tvtitle:TextView = view.findViewById(R.id.tv_title_item)
        var  tvprice:TextView = view.findViewById(R.id.tv_price_item)
        var  tvColor:TextView = view.findViewById(R.id.tv_color_item)
        var  imgitem:ImageView = view.findViewById(R.id.imgItem)
        var  layout = view.findViewById<ConstraintLayout>(R.id.item_list_layout)

        init {
            view.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            var position = adapterPosition
            if (position != RecyclerView.NO_POSITION)
                listener.onItemClick(position)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_categories, viewGroup, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.tvtitle.text = dataSet[position].title
        viewHolder.tvprice.text = "Price: "+dataSet[position].price.toString()
        viewHolder.tvColor.text = "Color: "+dataSet[position].color
        viewHolder.imgitem.setImageResource(dataSet[position].image)
        val item = dataSet[position]

    }

    override fun getItemCount() = dataSet.size

    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }

}