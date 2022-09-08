package com.pkdmart.e_commerce;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
private  WebView mWebView;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView=(WebView)findViewById(R.id.activity_main_webview);
        WebSettings webSettings=mWebView.getSettings();
        mWebView.getSettings().setLoadsImagesAutomatically(true);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("http://pkdmart.com/");
        mWebView.setWebViewClient(new WebViewClient());
    }

}
