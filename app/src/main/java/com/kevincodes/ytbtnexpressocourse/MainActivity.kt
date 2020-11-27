package com.kevincodes.ytbtnexpressocourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
 * In this example, MainActivity contains a [Button] and a [TextView].
 * When the button is clicked, the content of the TextView changes
 * to "Hello Espresso!".
 * */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayText = findViewById<TextView>(R.id.tvDisplayText)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            displayText.text = "Hello Espresso!"
        }
    }
}