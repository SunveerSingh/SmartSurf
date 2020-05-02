package com.devzeta.smartsurf.shopping.shoppingfragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

import com.devzeta.smartsurf.R
import com.devzeta.smartsurf.shopping.shoppingmainscreen

/**
 * A simple [Fragment] subclass.
 */
class ebay : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view  = inflater.inflate(R.layout.fragment_ebay, container, false)
        val activity: shoppingmainscreen? = activity as shoppingmainscreen?
        val myDataFromActivity: String? = activity!!.getmydatashop()
        println(myDataFromActivity)
        val webview = view.findViewById(R.id.shopebay) as WebView
        webview.settings.javaScriptEnabled = true
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=$myDataFromActivity")



        return view
    }


}
