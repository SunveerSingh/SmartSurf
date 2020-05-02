package com.devzeta.smartsurf.dictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devzeta.edusearch.PagerViewAdapterJobs
import com.devzeta.edusearch.PagerViewAdaptermusic
import com.devzeta.smartsurf.R
import kotlinx.android.synthetic.main.activity_dictionarymainscreen.*
import kotlinx.android.synthetic.main.activity_musicmainscreen.*
import kotlinx.android.synthetic.main.activity_musicmainscreen.tablayout
import kotlinx.android.synthetic.main.activity_shoppingmainscreen.*

class dictionarymainscreen : AppCompatActivity() {
    private lateinit var sPagerViewAdapter: PagerViewAdapterJobs

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dictionarymainscreen)

        getmydatashop()

        sPagerViewAdapter = PagerViewAdapterJobs(supportFragmentManager)
        viewpagerdic.adapter = sPagerViewAdapter
        tablayout.setupWithViewPager(viewpagerdic)
    }

    fun getmydatashop(): String? {
        val searchtxt = intent.getStringExtra("keywordjob")
        //println(searchtxt)
        return searchtxt
    }
}

