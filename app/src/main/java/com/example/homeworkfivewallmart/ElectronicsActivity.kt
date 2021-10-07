package com.example.homeworkfivewallmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_electronics.*

class ElectronicsActivity : AppCompatActivity(), CustomAdapter.OnItemClickListener {
    val products = ArrayList<Products>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electronics)

        initilizeUI()
        val adapter = CustomAdapter(products, this)
        recycler_view_electronics.adapter = adapter

    }

    private fun initilizeUI() {
        products.add(Products("Whirlpool Refrigerator ", 1399.00, "Grey", R.drawable.refrigerator,"id1", "Get loading flexibility .."))
        products.add(Products("ASUS VivoBook Laptop", 465.0, "Slate Gray", R.drawable.laptop,"id2", "15.6 inch Full HD .."))
        products.add(Products("SAMSUNG Smart TV", 297.99, "Black", R.drawable.television,"id3", "Full HD 1080p Resolution.."))
        products.add(Products("Epson All-in-One Printer", 79.90, "Black", R.drawable.printer,"id4", "The compact, wireless all-in-one .."))

    }


    override fun onItemClick(position: Int) {
        Toast.makeText(this, products[position].title+" clicked...", Toast.LENGTH_LONG).show()
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("ID", position)
        startActivity(intent)
    }
}