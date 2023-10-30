package com.example.mad_assignment_2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dollar = findViewById<EditText>(R.id.editText)
        val inr = findViewById<TextView>(R.id.textView2)
        val result = findViewById<Button>(R.id.convert)

        result.setOnClickListener {
            val doll = dollar.text.toString()

            if (doll.isNotEmpty()) {
                val dollarConvert = doll.toFloat()
                val converted = dollarConvert * 81
                inr.text = "INR = $converted"
            }
        }

    }
}
