package com.example.age_calculator_b122041_brijendra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count:Int = 0;

        var button:Button = findViewById<Button>(R.id.buttonClick)
        var text:TextView = findViewById<TextView>(R.id.textView3)

        button.setOnClickListener {
            count+=1
            text.text = count.toString()
        }
    }
}