package fon.bet.fonbet.bk.bkfonbet.others

import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebView
import androidx.core.view.doOnDetach
import androidx.fragment.app.Fragment
import fon.bet.fonbet.bk.bkfonbet.R

class WebFragment: Fragment(R.layout.web_fragment) {
    private lateinit var webView: WebView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val url = this.arguments?.getString("URL")
        webView = view.findViewById(R.id.webView)!!
        webView.settings.javaScriptEnabled = true
        webView.loadUrl(url!!)
        Log.e("clear", url.toString())
        webView.doOnDetach { requireActivity().onBackPressed() }
    }
}