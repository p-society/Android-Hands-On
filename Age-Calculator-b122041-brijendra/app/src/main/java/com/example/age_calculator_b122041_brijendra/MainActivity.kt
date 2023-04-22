package com.example.age_calculator_b122041_brijendra

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count:Int = 0;

        var button:Button = findViewById<Button>(R.id.buttonClick)
        var text:TextView = findViewById<TextView>(R.id.textView3)

        button.setOnClickListener {
            count+=1
            text.text = roman(count);
        }
    }

    private fun roman(count: Int): CharSequence? {
        var n = count
        val sb = StringBuilder()
        while (n >= 1000) {
            sb.append('M')
            n -= 1000
        }
        if (n >= 900) {
            sb.append("CM")
            n -= 900
        }
        if (n >= 500) {
            sb.append('D')
            n -= 500
        }
        if (n >= 400) {
            sb.append("CD")
            n -= 400
        }
        while (n >= 100) {
            sb.append('C')
            n -= 100
        }
        if (n >= 90) {
            sb.append("XC")
            n -= 90
        }
        if (n >= 50) {
            sb.append('L')
            n -= 50
        }
        if (n >= 40) {
            sb.append("XL")
            n -= 40
        }
        while (n >= 10) {
            sb.append('X')
            n -= 10
        }
        if (n === 9) {
            sb.append("IX")
            return sb.toString()
        }
        if (n >= 5) {
            sb.append('V')
            n -= 5
        }
        if (n === 4) {
            sb.append("IV")
            return sb.toString()
        }
        while (n > 0) {
            sb.append('I')
            n--
        }
        return sb.toString()
    }
}