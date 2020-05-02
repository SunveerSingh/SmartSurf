package com.devzeta.edusearch

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.devzeta.smartsurf.music.musicfragments.gaana
import com.devzeta.smartsurf.music.musicfragments.jiosavaan
import com.devzeta.smartsurf.music.musicfragments.soundcloud
import com.devzeta.smartsurf.music.musicfragments.winkmusic
import com.devzeta.smartsurf.shopping.shoppingfragments.*
import com.devzeta.smartsurf.web.webfragments.googlesearch

class PagerViewAdaptermusic(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                soundcloud()
            }
            1 -> {
                gaana()
            }
            2 -> {
                jiosavaan()
            }
            3 -> {
                winkmusic()
            }

            else -> googlesearch()
        }
    }

    override fun getCount(): Int {

        return 4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "Sound Cloud"
            1 -> return "Gaana"
            2 -> return "JioSaavan"
            3 -> return "Wink Music"
        }
        return null
    }

    operator fun invoke(supportFragmentManager: FragmentManager?): PagerAdapter? {
        return null
    }

}