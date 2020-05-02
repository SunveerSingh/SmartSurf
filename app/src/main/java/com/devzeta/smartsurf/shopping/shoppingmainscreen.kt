package com.devzeta.smartsurf.shopping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devzeta.edusearch.PagerViewAdapter
import com.devzeta.edusearch.PagerViewAdaptershop
import com.devzeta.smartsurf.R
import kotlinx.android.synthetic.main.activity_shoppingmainscreen.*
import kotlinx.android.synthetic.main.activity_webmainscreen.*
import kotlinx.android.synthetic.main.activity_webmainscreen.tablayout

class shoppingmainscreen : AppCompatActivity() {
    private lateinit var sPagerViewAdapter: PagerViewAdaptershop



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoppingmainscreen)

        getmydatashop()

        sPagerViewAdapter = PagerViewAdaptershop(supportFragmentManager)
        viewpagershop.adapter = sPagerViewAdapter
        tablayout.setupWithViewPager(viewpagershop)
}
    fun getmydatashop(): String? {
        val searchtxt = intent.getStringExtra("keywordshop")
        //println(searchtxt)
        return searchtxt
    }
}
