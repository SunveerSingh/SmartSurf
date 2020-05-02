package com.devzeta.smartsurf.music

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devzeta.edusearch.PagerViewAdaptermusic
import com.devzeta.edusearch.PagerViewAdaptershop
import com.devzeta.smartsurf.R
import kotlinx.android.synthetic.main.activity_musicmainscreen.*
import kotlinx.android.synthetic.main.activity_shoppingmainscreen.*
import kotlinx.android.synthetic.main.activity_shoppingmainscreen.tablayout
import kotlinx.android.synthetic.main.activity_webmainscreen.*

class musicmainscreen : AppCompatActivity() {
    private lateinit var sPagerViewAdapter: PagerViewAdaptermusic


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musicmainscreen)

        getmydatashop()

        sPagerViewAdapter = PagerViewAdaptermusic(supportFragmentManager)
        viewpagermusic.adapter = sPagerViewAdapter
        tablayout.setupWithViewPager(viewpagermusic)
    }

    fun getmydatashop(): String? {
        val searchtxt = intent.getStringExtra("keywordmusic")
        //println(searchtxt)
        return searchtxt
    }
}
