package com.devzeta.smartsurf.web

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devzeta.edusearch.PagerViewAdapter
import com.devzeta.smartsurf.R
import kotlinx.android.synthetic.main.activity_webmainscreen.*

class webmainscreen : AppCompatActivity() {
    private lateinit var mPagerViewAdapter: PagerViewAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webmainscreen)

        getMyData()

        mPagerViewAdapter = PagerViewAdapter(supportFragmentManager)
        viewpager.adapter = mPagerViewAdapter
        tablayout.setupWithViewPager(viewpager)


    }

    fun getMyData(): String? {
        val searchtxt = intent.getStringExtra("keywordweb")
        return searchtxt
    }
}
