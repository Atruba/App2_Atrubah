package com.example.thequiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.isEmpty
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var username = findViewById(R.id.Email) as EditText

        var password = findViewById(R.id.pass) as EditText

        var loginbutton = findViewById(R.id.button) as Button


        // set on-click listener

        loginbutton.setOnClickListener {

            val username = username.text;

            val password = password.text;



            if (isEmpty(username) || isEmpty(password)) {

                Toast.makeText(this@Login, "Please fill all fields", Toast.LENGTH_LONG).show()

            } else {
                Toast.makeText(this@Login, "Logged in", Toast.LENGTH_LONG).show()

            val intent=Intent(this,instructions::class.java)
                startActivity(intent)
                }

            }

        }

        }
