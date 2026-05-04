package com.example.lifehackapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
class ReviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val reviewText = findViewById<TextView>(R.id.rvtextView)

        // Display all questions + correct answers
        val reviewContent = """
            1. Rice fixes water damage → Myth
            2. Drinking water improves concentration → Hack
            3. Cracking knuckles causes arthritis → Myth
            4. Airplane mode charges faster → Hack
            5. Carrots improve night vision → Myth
        """.trimIndent()

        reviewText.text = reviewContent
    }
}