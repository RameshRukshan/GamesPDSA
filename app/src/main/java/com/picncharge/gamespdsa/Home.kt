package com.picncharge.gamespdsa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //  BOTTOM BUTTON NAVIGATION

        var btn_home : Button = findViewById(R.id.btn_home)
        var btn_games : Button = findViewById(R.id.btn_games)
        var btn_profie : Button = findViewById(R.id.btn_profilr)
        var btn_notification : Button = findViewById(R.id.btn_notifi)

        btn_home.setOnClickListener(){
            var go_home = Intent(this, Home::class.java)
            startActivity(go_home)
        }

        btn_games.setOnClickListener(){
            var go_games = Intent(this, Games::class.java)
            startActivity(go_games)
        }

        btn_notification.setOnClickListener(){
            var go_notifi = Intent(this, Notifications::class.java)
            startActivity(go_notifi)
        }

        btn_profie.setOnClickListener(){
            var go_profile = Intent(this, Profilr::class.java)
            startActivity(go_profile)
        }
    }
}