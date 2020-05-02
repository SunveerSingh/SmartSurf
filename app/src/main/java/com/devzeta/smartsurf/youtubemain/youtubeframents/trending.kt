package com.devzeta.smartsurf.youtubemain.youtubeframents


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

import com.devzeta.smartsurf.R

/**
 * A simple [Fragment] subclass.
 */
class trending : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view  = inflater.inflate(R.layout.fragment_trending, container, false)
        val webview = view.findViewById(R.id.youtubetranding) as WebView
        webview.settings.javaScriptEnabled = true
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://www.youtube.com/feed/trending")



        return view
    }


}
