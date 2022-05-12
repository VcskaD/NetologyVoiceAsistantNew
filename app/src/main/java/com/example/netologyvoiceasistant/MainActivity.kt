package com.example.netologyvoiceasistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val TAG:String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: String = "Vladislav"
        val surname:String = "Kalyuzhko"
        var age:Int = 32
        var heigth : Double = 176.0

        val summary: String = "Name :  $name Surname :  $surname Age :  $age Heigth : $heigth"

        val output: TextView = findViewById(R.id.output)
        output.text = summary

        Log.d(TAG, summary)
//
    }
}