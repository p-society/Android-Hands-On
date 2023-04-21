package com.example.age_calculator_b122005_achut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count:Int=0;
        val button:Button  =findViewById<Button>(R.id.button)
        var countview: TextView = findViewById<TextView>(R.id.textView2)
        button.setOnClickListener{

            count+=1
            countview.text = count.toString()
        }
    }
}