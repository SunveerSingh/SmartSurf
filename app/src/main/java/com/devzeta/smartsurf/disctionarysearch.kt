package com.devzeta.smartsurf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.devzeta.smartsurf.dictionary.dictionarymainscreen
import com.devzeta.smartsurf.web.webmainscreen
import kotlinx.android.synthetic.main.activity_disctionarysearch.*
import kotlinx.android.synthetic.main.activity_websearch.*

class disctionarysearch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disctionarysearch)

        dictionarybutton.setOnClickListener {
            movetofragments()
        }
    }

    private fun movetofragments(){
        val searchtxtjob = disctonarysearchtxt.text.toString()
        if(searchtxtjob.isEmpty()){
            Toast.makeText(applicationContext, "Please Enter A keyword", Toast.LENGTH_LONG).show()
        }
        else{
            val i = Intent(applicationContext, dictionarymainscreen::class.java)
            i.putExtra("keywordjob", searchtxtjob)
            startActivity(i)
        }
    }
}
