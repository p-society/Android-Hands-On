package com.shreyansh.agecalculator_b122109_shreyanshgupt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count: Int = 0


        var button = findViewById<Button>(R.id.buttonClick)
        var countView = findViewById<TextView>(R.id.textView2)
        button.setOnClickListener {
            count += 1
            countView.text = count.toString()
        }
    }
}

