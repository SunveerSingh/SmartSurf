package com.devzeta.smartsurf.web.webfragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

import com.devzeta.smartsurf.R
import com.devzeta.smartsurf.web.webmainscreen

/**
 * A simple [Fragment] subclass.
 */
class duckduckgo : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view  = inflater.inflate(R.layout.fragment_duckduckgo, container, false)
        val activity: webmainscreen? = activity as webmainscreen?
        val myDataFromActivity: String? = activity!!.getMyData()
        println(myDataFromActivity)
        val webview = view.findViewById(R.id.webduckduckgo) as WebView
        webview.settings.javaScriptEnabled = true
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://duckduckgo.com/?q=$myDataFromActivity")



        return view
    }


}
