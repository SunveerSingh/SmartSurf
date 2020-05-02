package com.devzeta.edusearch

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.devzeta.smartsurf.dictionary.dictonaryfragments.cambridge
import com.devzeta.smartsurf.dictionary.dictonaryfragments.dictionarycom
import com.devzeta.smartsurf.dictionary.dictonaryfragments.merriamwebster
import com.devzeta.smartsurf.dictionary.dictonaryfragments.oxford
import com.devzeta.smartsurf.web.webfragments.bingsearch
import com.devzeta.smartsurf.web.webfragments.duckduckgo
import com.devzeta.smartsurf.web.webfragments.googlesearch
import com.devzeta.smartsurf.web.webfragments.yahoosearch

class PagerViewAdapterJobs(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                merriamwebster()
            }
            1 -> {
                oxford()
            }
            2 -> {
                cambridge()
            }
            3 -> {
                dictionarycom()
            }

            else -> googlesearch()
        }
    }

    override fun getCount(): Int {

        return 4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "Merriam-Webster"
            1 -> return "Oxford"
            2 -> return "Cambridge dictionary"
            3 -> return "dictionary.com"
        }
        return null
    }

    operator fun invoke(supportFragmentManager: FragmentManager?): PagerAdapter? {
        return null
    }

}