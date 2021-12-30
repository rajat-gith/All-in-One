package com.example.a16_112

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val i=intent.getStringExtra("key_1")
        val t1=findViewById<TextView>(R.id.textView)
        t1.text=i
        val bt=findViewById<Button>(R.id.button2)
        bt.setOnClickListener{
           val i1=Intent(this,MainActivity::class.java)
            startActivity(i1)
        }
    }
}


