package com.picncharge.gamespdsa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_continue : Button = findViewById(R.id.button)

        btn_continue.setOnClickListener(){
            var to_home = Intent(this, Home::class.java)
            startActivity(to_home)
        }

    }

}