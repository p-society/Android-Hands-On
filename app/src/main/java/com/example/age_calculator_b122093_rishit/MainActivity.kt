package com.example.age_calculator_b122093_rishit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onTap(view : View){
        count++
        val clickv=findViewById<TextView>(R.id.clickv) as TextView
        clickv.text="You Have Clicked $count Times"
    }
}