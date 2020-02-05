package com.example.pregradomestria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebMenu extends AppCompatActivity {

    WebView mWebView;

    @Override
    public void onBackPressed() {
        if (mWebView.canGoBack()){
            mWebView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_menu);

        mWebView=findViewById(R.id.menuweb);
        Intent intent = getIntent();

        String webSite=intent.getStringExtra("links");

        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl(webSite);

        WebSettings webSettings= mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}
