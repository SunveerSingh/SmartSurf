package com.devzeta.smartsurf.youtubemain.youtubeframents


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
class educational : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view  = inflater.inflate(R.layout.fragment_educational, container, false)
        val webview = view.findViewById(R.id.youtubeeducational) as WebView
        webview.settings.javaScriptEnabled = true
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://www.youtube.com/results?search_query=educational")



        return view
    }

}
