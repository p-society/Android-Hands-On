package com.example.button_counter_b222032

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            var counter = 0
            val  counterTextView = findViewById<TextView>(R.id.counterTextView)
            val counterButton = findViewById<Button>(R.id.counterButton)

            // Set the click listener for the button
            counterButton.setOnClickListener {
                // Increment the counter
                counter++

                // Update the text view with the new counter value
                counterTextView.text = counter.toString()

            }
        }
    }
