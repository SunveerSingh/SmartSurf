package com.devzeta.smartsurf.youtubemain


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.devzeta.smartsurf.news.newsfragments.bbc
import com.devzeta.smartsurf.news.newsfragments.cnn
import com.devzeta.smartsurf.news.newsfragments.guardian
import com.devzeta.smartsurf.news.newsfragments.tribune
import com.devzeta.smartsurf.web.webfragments.googlesearch
import com.devzeta.smartsurf.youtubemain.youtubeframents.*

class PagerViewAdapterNews(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                guardian()
            }
            1 -> {
                cnn()
            }
            2 -> {
                bbc()
            }
            3 -> {
                tribune()
            }
            else -> googlesearch()
        }
    }

    override fun getCount(): Int {

        return 4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "The Guardian"
            1 -> return "CNN"
            2 -> return "BBC"
            3 -> return "The Tribune"
        }
        return null
    }

    operator fun invoke(supportFragmentManager: FragmentManager?): PagerAdapter? {
        return null
    }

}