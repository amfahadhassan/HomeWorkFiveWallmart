package com.example.homeworkfivewallmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    val products = ArrayList<Products>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        var pos = intent.getIntExtra("ID", 0)
        initilizeUI()
        tv_title_detail.text = products[pos].title
        img_detail.setImageResource(products[pos].image)
        tv_color_detail.text = "Color: "+products[pos].color
        tv_price_detail.text = "Price: $"+products[pos].price.toString()
        tv_desc_detail.text = products[pos].desc


    }

    private fun initilizeUI() {
        products.add(Products("Whirlpool 24.6-cu ft Side-By-Side Refrigerator with Ice and Water Dispenser - Stainless Steel", 1399.00, "Grey", R.drawable.refrigerator,"id1", "Get loading flexibility with adjustable gallon door bins\n" +
                "\n" +
                "Keep food looking like it should with LED interior lighting\n" +
                "\n" +
                "Get filtered water and ice with the exterior dual pad dispensers"))
        products.add(Products("ASUS VivoBook 15 Thin and Light Laptop", 465.0, "Slate Gray", R.drawable.laptop,"id2", "15.6 inch Full HD (1920x1080) 4-way NanoEdge bezel display with a stunning 88% screen-to-body ratio\n" +
                "Compatible with Google Classroom; run Google Classroom on Microsoft Edge or Internet Explorer 11\n" +
                "Latest 10th Gen Intel Core i3-1005G1 CPU (4M Cache, up to 3.4 GHz)"))
        products.add(Products("SAMSUNG 40-inch Class LED Smart FHD TV 1080P", 297.99, "black", R.drawable.television,"id3", "Full HD 1080p Resolution\n" +
                "PurColor\n" +
                "Micro Dimming Pro\n" +
                "Samsung Smart TV. Mini Wall Mount and Vesa Wall Mount Compatible\n" +
                "SmartThings App Support. Product Size (W x H x D) Without Stand-36.3 x 20.9 x 2.9 inches. Stand Size (WxHxD)-5.2 x 5.6 x 6.7 inches"))
        products.add(Products("Epson - WorkForce WF-2830 Wireless All-in-One Inkjet Printer - Black", 79.90, "black", R.drawable.printer,"id4", "The compact, wireless all-in-one for the home office.\n" +
                "With auto 2-sided printing, plus a 30-page Auto Document Feeder, the WorkForce WF-2830 offers efficient, reliable home office printing."))

    }
}