package com.example.lifehackapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
class ScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val scoreText = findViewById<TextView>(R.id.sctextView)
        val feedbackText = findViewById<TextView>(R.id.fb2textView)
        val reviewButton = findViewById<Button>(R.id.rwbutton)

        // Get data from QuizActivity
        val score = intent.getIntExtra("SCORE", 0)
        val total = intent.getIntExtra("TOTAL", 0)

        scoreText.text = "Score: $score / $total"

        // Personalised feedback
        feedbackText.text = when {
            score == total -> "Master Hacker! "
            score >= total / 2 -> "Great job! "
            else -> "Stay Safe Online! ⚠"
        }

        // Review button → go to ReviewActivity
        reviewButton.setOnClickListener {
            val intent = Intent(this, ReviewActivity::class.java)
            startActivity(intent)
        }
    }
}