package com.example.testapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.webkit.WebView
import androidx.core.view.doOnDetach
import androidx.fragment.app.Fragment
import kotlin.system.exitProcess

class WebFragment(): Fragment(R.layout.web_fragment) {
    private lateinit var webView: WebView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val url = this.arguments?.getString("URL")
        webView = view.findViewById(R.id.webView)!!
        webView.settings.javaScriptEnabled = true
        webView.loadUrl(url!!)
        webView.doOnDetach { requireActivity().onBackPressed() }
    }
}