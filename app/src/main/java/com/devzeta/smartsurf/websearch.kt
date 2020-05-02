package com.devzeta.smartsurf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.devzeta.smartsurf.web.webmainscreen
import kotlinx.android.synthetic.main.activity_websearch.*

class websearch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_websearch)

        webbutton.setOnClickListener {
            movetofragments()
        }


    }

    private fun movetofragments(){
        val searchtxtweb = websearchtxt.text.toString()
        if(searchtxtweb.isEmpty()){
            Toast.makeText(applicationContext, "Please Enter A keyword", Toast.LENGTH_LONG).show()
        }
        else{
            val i = Intent(applicationContext, webmainscreen::class.java)
            i.putExtra("keywordweb", searchtxtweb)
            startActivity(i)
        }
    }
}
