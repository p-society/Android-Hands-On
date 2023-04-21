package com.example.age_calculator_b222039_prriya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count:Int=0
        var button = findViewById<Button>(R.id.button)
        var countView= findViewById<TextView>(R.id.tvCount)
        button.setOnClickListener {
        count++
        countView.text = count.toString()}

    }
}