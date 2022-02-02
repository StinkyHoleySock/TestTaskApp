package com.example.testtaskapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<RelativeLayout>(R.id.btn_subscribe_six_month)
        val button2 = findViewById<RelativeLayout>(R.id.btn_subscribe_one_month)
        val button3 = findViewById<RelativeLayout>(R.id.btn_subscribe_forever)

        val icon1 = findViewById<ImageView>(R.id.iv_check_mark_1)
        val icon2 = findViewById<ImageView>(R.id.iv_check_mark_2)
        val icon3 = findViewById<ImageView>(R.id.iv_check_mark_3)

        button1.setOnClickListener{
            button1.isSelected = true
            button2.isSelected = false
            button3.isSelected = false

            icon1.isVisible = true
            icon2.isVisible = false
            icon3.isVisible = false
        }
        button2.setOnClickListener{
            button1.isSelected = false
            button2.isSelected = true
            button3.isSelected = false

            icon1.isVisible = false
            icon2.isVisible = true
            icon3.isVisible = false
        }
        button3.setOnClickListener{
            button1.isSelected = false
            button2.isSelected = false
            button3.isSelected = true

            icon1.isVisible = false
            icon2.isVisible = false
            icon3.isVisible = true
        }
    }
}