package com.example.age_calculator_b122029_asutoshkatrauka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count:Int = 0
        var button =findViewById<Button>(R.id.buttonclick)
        var countView = findViewById<TextView>(R.id.textView3)

        button.setOnClickListener {
            count++
            countView.text=count.toString()
        }





    }
}