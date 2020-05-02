package com.devzeta.smartsurf.youtubemain


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.devzeta.smartsurf.web.webfragments.googlesearch
import com.devzeta.smartsurf.youtubemain.youtubeframents.*

class PagerViewAdapterYotube(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                trending()
            }
            1 -> {
                music()
            }
            2 -> {
                technical()
            }
            3 -> {
                films()
            }
            4 -> {
                news()
            }
            5 -> {
                educational()
            }

            else -> googlesearch()
        }
    }

    override fun getCount(): Int {

        return 6
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "Trending"
            1 -> return "Music"
            2 -> return "Technology"
            3 -> return "Films"
            4 -> return "News"
            5 -> return "Educational"
        }
        return null
    }

    operator fun invoke(supportFragmentManager: FragmentManager?): PagerAdapter? {
        return null
    }

}