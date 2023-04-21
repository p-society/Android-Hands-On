package com.example.age_calculator_b222050_shriyasahu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var c = 0
        var count : TextView = findViewById(R.id.tv_count)
        var btn : Button = findViewById(R.id.btn_click)

        btn.setOnClickListener {
            c = c + 1
            count.text = c.toString()
        }

   }
}