package com.devzeta.smartsurf.dictionary.dictonaryfragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

import com.devzeta.smartsurf.R
import com.devzeta.smartsurf.dictionary.dictionarymainscreen
import com.devzeta.smartsurf.shopping.shoppingmainscreen

/**
 * A simple [Fragment] subclass.
 */
class cambridge : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view  = inflater.inflate(R.layout.fragment_cambridge, container, false)
        val activity: dictionarymainscreen? = activity as dictionarymainscreen?
        val myDataFromActivity: String? = activity!!.getmydatashop()
        println(myDataFromActivity)
        val webview = view.findViewById(R.id.diccambridge) as WebView
        webview.settings.javaScriptEnabled = true
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://dictionary.cambridge.org/dictionary/english/$myDataFromActivity")



        return view
    }


}
