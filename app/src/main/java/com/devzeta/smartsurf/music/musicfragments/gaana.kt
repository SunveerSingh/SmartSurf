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

/**
 * A simple [Fragment] subclass.
 */
class gaana : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view  = inflater.inflate(R.layout.fragment_gaana, container, false)
        val activity: musicmainscreen? = activity as musicmainscreen?
        val myDataFromActivity: String? = activity!!.getmydatashop()
        println(myDataFromActivity)
        val webview = view.findViewById(R.id.musicgaana) as WebView
        webview.settings.javaScriptEnabled = true

        webview.settings.allowContentAccess = true
        webview.settings.domStorageEnabled = true
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://gaana.com/search/$myDataFromActivity")



        return view
    }


}
