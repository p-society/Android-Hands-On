package com.example.agecalculator_b122079_divyakumar_patel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count:Int =0
        var button =findViewById<Button>(R.id.buttonclick)
        var countview=findViewById<TextView>(R.id.editTextNumber)
        button.setOnClickListener{
            count+=1
            countview.text=count.toString()
        }
    }
}