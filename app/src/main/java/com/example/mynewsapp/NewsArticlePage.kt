package com.example.mynewsapp
//when we clicked to the article ıt is navigate to there
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun NewsArticlePage(url: String) {
    AndroidView(factory = { context ->
        WebView(context).apply {  //implementing the web view
            settings.javaScriptEnabled = true
            webViewClient = WebViewClient()
            loadUrl(url)
        }
    })
}