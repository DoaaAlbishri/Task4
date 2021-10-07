package com.example.task4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var text : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent = intent
        val name =intent.getStringExtra("Name")
        val loc = intent.getStringExtra("Loc")
        text = findViewById(R.id.textView)
        text.text = "Name: $name \nLocation: $loc"
    }
}