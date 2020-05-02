package com.devzeta.smartsurf.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devzeta.smartsurf.R
import com.devzeta.smartsurf.youtubemain.PagerViewAdapterNews
import com.devzeta.smartsurf.youtubemain.PagerViewAdapterYotube
import kotlinx.android.synthetic.main.activity_newsmainscreen.*
import kotlinx.android.synthetic.main.activity_shoppingmainscreen.*
import kotlinx.android.synthetic.main.activity_youtubemainscreen.*
import kotlinx.android.synthetic.main.activity_youtubemainscreen.tablayout

class newsmainscreen : AppCompatActivity() {

    private lateinit var sPagerViewAdapter: PagerViewAdapterNews


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newsmainscreen)

        sPagerViewAdapter = PagerViewAdapterNews(supportFragmentManager)
        viewpagernews.adapter = sPagerViewAdapter
        tablayout.setupWithViewPager(viewpagernews)
    }
}
