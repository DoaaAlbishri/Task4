package com.example.task4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edName: EditText
    lateinit var edLoc: EditText
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edName = findViewById(R.id.editTextTextPersonName)
        edLoc = findViewById(R.id.editTextTextPersonName3)
        btn = findViewById(R.id.button2)

        btn.setOnClickListener {
            val name = edName.text.toString()
            val loc = edLoc.text.toString()
            val intent = Intent(this , MainActivity2::class.java)
            intent.putExtra("Name",name)
            intent.putExtra("Loc",loc)
            startActivity(intent)
        }



    }
}