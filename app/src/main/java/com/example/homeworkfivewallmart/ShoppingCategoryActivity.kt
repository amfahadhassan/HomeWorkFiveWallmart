package com.example.homeworkfivewallmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_shopping_category.*

class ShoppingCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_category)

        tvWelcome.text = intent.getStringExtra("EMAIL")
        imgElectronics.setOnClickListener{

            startActivity(Intent(this, ElectronicsActivity::class.java))
            Toast.makeText(this, "You have chosen the Electronics category", Toast.LENGTH_SHORT).show()
        }
        imgClothing.setOnClickListener{
            startActivity(Intent(this, ClothingActivity::class.java))
            Toast.makeText(this, "You have chosen the Clothing category", Toast.LENGTH_SHORT).show()
        }
        imgBeauty.setOnClickListener{
            Toast.makeText(this, "You have chosen the Beauty category", Toast.LENGTH_SHORT).show()
        }
        imgFood.setOnClickListener{
            Toast.makeText(this, "You have chosen the Food category", Toast.LENGTH_SHORT).show()
        }

    }
}