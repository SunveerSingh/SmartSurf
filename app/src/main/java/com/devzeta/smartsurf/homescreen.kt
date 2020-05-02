package com.devzeta.smartsurf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.devzeta.smartsurf.news.newsmainscreen
import com.devzeta.smartsurf.websearch
import com.devzeta.smartsurf.youtubemain.youtubemainscreen
import kotlinx.android.synthetic.main.activity_homescreen.*

class homescreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)

        val overlay: View = findViewById(R.id.homescreen)

        overlay.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    or View.SYSTEM_UI_FLAG_FULLSCREEN
        )

        websearch.setOnClickListener {
            val i = Intent(applicationContext, com.devzeta.smartsurf.websearch::class.java)
            startActivity(i)
        }

        shopping.setOnClickListener {
            val i = Intent(applicationContext, shoppingsearch::class.java)
            startActivity(i)
        }

        music.setOnClickListener {
            val i = Intent(applicationContext, musicsearch::class.java)
            startActivity(i)
        }
        dictonary.setOnClickListener {
            val i = Intent(applicationContext, disctionarysearch::class.java)
            startActivity(i)
        }
        youtube.setOnClickListener {
            val i = Intent(applicationContext, youtubemainscreen::class.java)
            startActivity(i)
        }
        news.setOnClickListener {
            val i = Intent(applicationContext, newsmainscreen::class.java)
            startActivity(i)
        }
    }
}
