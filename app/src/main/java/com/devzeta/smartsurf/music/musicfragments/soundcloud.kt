package com.devzeta.smartsurf.music.musicfragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

import com.devzeta.smartsurf.R
import com.devzeta.smartsurf.music.musicmainscreen
import com.devzeta.smartsurf.shopping.shoppingmainscreen

/**
 * A simple [Fragment] subclass.
 */
class soundcloud : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view  = inflater.inflate(R.layout.fragment_soundcloud, container, false)
        val activity: musicmainscreen? = activity as musicmainscreen?
        val myDataFromActivity: String? = activity!!.getmydatashop()
        println(myDataFromActivity)
        val webview = view.findViewById(R.id.musicsoundcloud) as WebView
        webview.settings.javaScriptEnabled = true
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://soundcloud.com/search?q=$myDataFromActivity")



        return view
    }


}
