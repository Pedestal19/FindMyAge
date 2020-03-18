package com.example.startup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buFindAge.setOnClickListener {
            val yearOfBirth:Int = txtYearOfBirth.text.toString().toInt()
            val myAge = 2020 - yearOfBirth
//            tvShowAge.text = myAge.toString()
            tvShowAge.text = "Your age is $myAge years"

        }

    }
}
