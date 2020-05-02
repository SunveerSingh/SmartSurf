package com.devzeta.edusearch

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.devzeta.smartsurf.web.webfragments.bingsearch
import com.devzeta.smartsurf.web.webfragments.duckduckgo
import com.devzeta.smartsurf.web.webfragments.googlesearch
import com.devzeta.smartsurf.web.webfragments.yahoosearch

class PagerViewAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                googlesearch()
            }
            1 -> {
                duckduckgo()
            }
            2 -> {
                bingsearch()
            }
            3 -> {
                yahoosearch()
            }

            else -> googlesearch()
        }
    }

    override fun getCount(): Int {

        return 4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "Google Search"
            1 -> return "Duck Duck Go"
            2 -> return "Bing Search"
            3 -> return "Yahoo Search"
        }
        return null
    }

    operator fun invoke(supportFragmentManager: FragmentManager?): PagerAdapter? {
        return null
    }

}