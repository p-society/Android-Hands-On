 package com.example.age_calculator_b122122_swastik

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

 class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    var number =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count:Int=0
        val clickedbutton: Button = findViewById<Button>(R.id.MerekoDabao)
        val text: TextView = findViewById(R.id.textView2)
       clickedbutton.setOnClickListener {
           number++
           text.text=number.toString()
       }
    }
}