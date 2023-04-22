package com.example.age_calculator_b422051_sarbojeet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count:Int =0
        val button= findViewById<Button>(R.id.buttonClick)
        var countView = findViewById<TextView>(R.id.tvCount)
        button.setOnClickListener{
            count+=1
            countView.text=count.toString()
        }
    }
}