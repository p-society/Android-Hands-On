package com.example.age_calculator_b422041_punit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count:Int = 0
        val clickedButton:Button = findViewById<Button>(R.id.buttonClick)
        val textView:TextView = findViewById<TextView>(R.id.textView2)

        clickedButton.setOnClickListener{
            count++
            textView.text = "$count"
        }
    }


}