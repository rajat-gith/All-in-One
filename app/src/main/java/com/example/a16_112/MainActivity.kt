package com.example.a16_112

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            val i=Intent(this,SecondActivity::class.java)
            i.putExtra("key_1","Rajat")
            i.putExtra("key_2",1)
            startActivity(i)
        }
        //mail
        val m=findViewById<Button>(R.id.mb)
        val e=findViewById<EditText>(R.id.eTname)
        m.setOnClickListener{
            val email=e.text.toString()
            val i=Intent()
            i.action=Intent.ACTION_SENDTO
            i.data= Uri.parse("mailto:$email")
            i.putExtra(Intent.EXTRA_SUBJECT,"Implicit Indents")
            startActivity(i)
        }
        //browse
        val b=findViewById<Button>(R.id.bt)
        b.setOnClickListener{
            val address=e.text.toString()
            val i=Intent()
            i.action=Intent.ACTION_VIEW
            i.data= Uri.parse("http://$address")
            startActivity(i)
        }
        //dial
        val d=findViewById<Button>(R.id.db)
        d.setOnClickListener{
            val mobile=e.text.toString()
            val i=Intent()
            i.action=Intent.ACTION_VIEW
            i.data= Uri.parse("tel:$mobile")
            startActivity(i)
        }
    }
}