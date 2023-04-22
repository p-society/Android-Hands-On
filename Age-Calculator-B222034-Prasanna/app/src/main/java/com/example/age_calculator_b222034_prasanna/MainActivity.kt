package com.example.age_calculator_b222034_prasanna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count:Int = 0
        val clickedButton:Button  = findViewById(R.id.Button)
        val countText:TextView = findViewById(R.id.tvCount)
        clickedButton.setOnClickListener {
            count++
            countText.text = count.toString()
//            clickedButton.backgroundTintList=
    }
}
}