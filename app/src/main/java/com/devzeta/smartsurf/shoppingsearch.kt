package com.devzeta.smartsurf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.devzeta.smartsurf.shopping.shoppingmainscreen
import kotlinx.android.synthetic.main.activity_shoppingsearch.*

class shoppingsearch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoppingsearch)

        shoppingbutton.setOnClickListener {
            movetofragments()
        }
    }

    private fun movetofragments(){
        val searchtxtshop = shoppingtxt.text.toString()
        if (searchtxtshop.isEmpty()){
            Toast.makeText(applicationContext, "Please Enter a Keyword", Toast.LENGTH_LONG).show()
        }
        else{
            val i = Intent(applicationContext, shoppingmainscreen::class.java)
            i.putExtra("keywordshop", searchtxtshop)
            startActivity(i)
        }
    }
}
