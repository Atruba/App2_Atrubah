package com.example.thequiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.thequiz.databinding.ActivityHomeBinding

/**
 * Created by Techpass Master.
 * Website - www.techpassmaster.com
 * Youtube - Techpass Master
 */
class HomeActivity : AppCompatActivity() {
    private lateinit var activityHomeBinding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)
        activityHomeBinding.playQuizHomeBtn.setOnClickListener {
            val intent = Intent(this@HomeActivity, PlayActivity::class.java)
            startActivity(intent)
        }
    }
}