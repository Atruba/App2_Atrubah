package com.example.thequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.annotation.SuppressLint
import android.widget.Toast
import com.example.thequiz.databinding.ActivityResultBinding
/**
 * Created by Techpass Master.
 * Website - www.techpassmaster.com
 * Youtube - Techpass Master
 */
class ResultActivity : AppCompatActivity() {
    private lateinit var activityResultBinding: ActivityResultBinding
    var totalScore = 0
    var correct = 0
    var wrong = 0
    var skip = 0
    var isKey = false

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityResultBinding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(activityResultBinding.root)
        totalScore = intent.extras!!.getInt("correct")
        wrong = intent.extras!!.getInt("wrong")
        skip = intent.extras!!.getInt("skip")
        initializeViews()
    }

    @SuppressLint("SetTextI18n")
    private fun initializeViews() {
        activityResultBinding.apply {
            tvScore.text = "Score: $totalScore"
            tvright.text = "Correct: $totalScore"
            tvwrong.text = "Wrong: $wrong"
            tvSkip.text = "Skip: $skip"
            if (totalScore >= 6) {
                activityResultBinding.emojiReactionImg.setImageResource(R.drawable.smile)
                Toast.makeText(this@ResultActivity, "Wow Great", Toast.LENGTH_SHORT).show()
            } else {
                emojiReactionImg.setImageResource(R.drawable.angry)
                Toast.makeText(this@ResultActivity, "Need Improvement", Toast.LENGTH_SHORT).show()
            }
            tvPlayAgain.setOnClickListener {
                finish()
            }
        }
    }
}