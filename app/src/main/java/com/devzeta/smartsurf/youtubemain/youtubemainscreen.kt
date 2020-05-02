package com.devzeta.smartsurf.youtubemain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devzeta.edusearch.PagerViewAdaptershop
import com.devzeta.smartsurf.R
import kotlinx.android.synthetic.main.activity_shoppingmainscreen.*
import kotlinx.android.synthetic.main.activity_shoppingmainscreen.tablayout
import kotlinx.android.synthetic.main.activity_webmainscreen.*
import kotlinx.android.synthetic.main.activity_youtubemainscreen.*

class youtubemainscreen : AppCompatActivity() {
    private lateinit var sPagerViewAdapter: PagerViewAdapterYotube


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtubemainscreen)

        sPagerViewAdapter = PagerViewAdapterYotube(supportFragmentManager)
        youtubeviewPager.adapter = sPagerViewAdapter
        tablayout.setupWithViewPager(youtubeviewPager)
    }
}
