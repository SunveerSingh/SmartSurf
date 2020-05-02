package com.devzeta.smartsurf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.devzeta.smartsurf.music.musicmainscreen
import com.devzeta.smartsurf.shopping.shoppingmainscreen
import kotlinx.android.synthetic.main.activity_musicsearch.*
import kotlinx.android.synthetic.main.activity_shoppingsearch.*

class musicsearch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musicsearch)
        musicsearchbutton.setOnClickListener {
            movetofragments()
        }
    }

    private fun movetofragments(){
        val seatchtxtmusic = musictxt.text.toString()
        if (seatchtxtmusic.isEmpty()){
            Toast.makeText(applicationContext, "Please Enter a Keyword", Toast.LENGTH_LONG).show()
        }
        else{
            val i = Intent(applicationContext, musicmainscreen::class.java)
            i.putExtra("keywordmusic", seatchtxtmusic)
            startActivity(i)
        }
    }
}
