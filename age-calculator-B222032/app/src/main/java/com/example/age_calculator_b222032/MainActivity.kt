package com.example.age_calculator_b222032

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun onCreate(savedInstanceState: Bundle?) {
            onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            var  counter =0
            // Initialize the views
            val counterTextView:TextView = findViewById(R.id.counterTextView)
            val counterButton:Button = findViewById(R.id.counterButton)

            // Set the click listener for the button
            counterButton.setOnClickListener {
                // Increment the counter
                counter++

                // Update the text view with the new counter value
                counterTextView.text = counter.toString()

            }
        }
    }
}