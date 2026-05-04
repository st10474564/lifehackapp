package com.example.lifehackapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
class QuizActivity : AppCompatActivity() {

    // Track current question index
    private var currentIndex = 0

    // Track score
    private var score = 0

    // Store user's answers for review
    private val userAnswers = mutableListOf<Boolean>()

    // Flashcard list
    // This defines your flashcard structure
    data class Flashcard(
        val statement: String,   // the question text
        val isTrue: Boolean,     // correct answer
        val explanation: String  // explanation for review
    )
    val flashcards = listOf(
        Flashcard("Putting your phone in rice fixes water damage", false,
            "Rice does not effectively remove moisture from phones."),
        Flashcard("Drinking water improves concentration", true,
            "Hydration helps brain function."),
        Flashcard("Cracking knuckles causes arthritis", false,
            "No scientific evidence supports this."),
        Flashcard("Airplane mode charges your phone faster", true,
            "Less background activity speeds up charging."),
        Flashcard("Carrots drastically improve night vision", false,
            "This is a myth from WWII propaganda.")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val questionText = findViewById<TextView>(R.id.qtextView)
        val feedbackText = findViewById<TextView>(R.id.fbtextView)
        val trueButton = findViewById<Button>(R.id.trbutton)
        val falseButton = findViewById<Button>(R.id.fabutton)
        val nextButton = findViewById<Button>(R.id.nxtbutton)

        // Function to display current question
        fun showQuestion() {
            questionText.text = flashcards[currentIndex].statement
            feedbackText.text = "" // clear feedback
        }

        showQuestion()

        // Handle True button click
        trueButton.setOnClickListener {
            checkAnswer(true, feedbackText)
        }

        // Handle False button click
        falseButton.setOnClickListener {
            checkAnswer(false, feedbackText)
        }

        // Next button → move to next question
        nextButton.setOnClickListener {
            currentIndex++

            // If questions finished → go to Score screen
            if (currentIndex >= flashcards.size) {
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("SCORE", score)
                intent.putExtra("TOTAL", flashcards.size)
                intent.putExtra("ANSWERS", userAnswers.toBooleanArray())
                startActivity(intent)
                finish()
            } else {
                showQuestion()
            }
        }
    }

    // Function to check if user's answer is correct
    private fun checkAnswer(userAnswer: Boolean, feedbackText: TextView) {

        val correctAnswer = flashcards[currentIndex].isTrue

        // Save user's answer for review
        userAnswers.add(userAnswer)

        if (userAnswer == correctAnswer) {
            score++
            feedbackText.text = "Correct! That's a real time-saver!"
        } else {
            feedbackText.text = "Wrong! That's just an urban myth."
        }
    }
}