package com.example.yochat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setting the layout
        setContentView(R.layout.activity_main)
        /**
         * Accessing the button elements, we check if the button is clicked
         * then call the texts in the scope
         */

        register_button_register.setOnClickListener {
            /**
             * getting the entered email and password and saving them in variables
             * this is a way we access all the text elements
             */
            val email = email_edittext_register.text.toString()

            val password = password_edittext_register.text.toString()

            Log.d("MainActivity", "Email is " + email)
            Log.d("MainActivity", "Password is $password")
        }

        already_have_account_textview.setOnClickListener {
            Log.d("MainActivity", "Try to show Login activity")

            //launching the login page
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
