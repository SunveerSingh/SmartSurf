package com.devzeta.edusearch

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.devzeta.smartsurf.shopping.shoppingfragments.*
import com.devzeta.smartsurf.web.webfragments.googlesearch

class PagerViewAdaptershop(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                amazon()
            }
            1 -> {
                flipkart()
            }
            2 -> {
                ebay()
            }
            3 -> {
                snapdeal()
            }
            4 -> {
                myntra()
            }
            5 -> {
                alibaba()
            }
            6 -> {
                aliexpress()
            }

            else -> googlesearch()
        }
    }

    override fun getCount(): Int {

        return 7
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "Amazon"
            1 -> return "Flipkart"
            2 -> return "Ebay"
            3 -> return "Snapdeal"
            4 -> return  "Myntra"
            5 -> return  "Alibaba"
            6 -> return  "Aliexpress"
        }
        return null
    }

    operator fun invoke(supportFragmentManager: FragmentManager?): PagerAdapter? {
        return null
    }

}