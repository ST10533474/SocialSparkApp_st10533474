package com.example.socialsparkapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputTime = findViewById<EditText>(R.id.inputTime)
        val generateBtn = findViewById<Button>(R.id.generateBtn)
        val resetBtn = findViewById<Button>(R.id.resetBtn)
        val resultText = findViewById<TextView>(R.id.resultText)

        // 🔥 MAIN LOGIC (THIS IS WHAT YOUR ASSIGNMENT WANTS)
        generateBtn.setOnClickListener {

            val userInput = inputTime.text.toString().trim().lowercase()

            val suggestion = when (userInput) {
                "morning" -> "Send a \"Good morning\" text to a family member."
                "mid-morning" -> "Reach out to a colleague with a quick \"Thank you.\""
                "afternoon" -> "Share a funny meme or interesting link with a friend."
                "afternoon snack time" -> "Send a quick \"thinking of you\" message."
                "dinner" -> "Call a friend or relative for a 5-minute catch-up."
                "night", "after dinner" -> "Leave a thoughtful comment on a friend's post."
                else -> "Please enter a valid time (Morning, Afternoon, Dinner, etc.)"
            }

            resultText.text = suggestion
        }

        // 🔄 RESET BUTTON
        resetBtn.setOnClickListener {
            inputTime.text.clear()
            resultText.text = ""
        }
    }
}
