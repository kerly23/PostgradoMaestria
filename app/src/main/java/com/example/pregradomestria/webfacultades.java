package com.example.pregradomestria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webfacultades extends AppCompatActivity {
    WebView wfacultades;
    @Override
    public void onBackPressed() {
        if (wfacultades.canGoBack()){
            wfacultades.goBack();
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webfacultades);

        wfacultades=findViewById(R.id.facultadesweb);
        Intent intent = getIntent();

        String webSite=intent.getStringExtra("links");

        wfacultades.setWebViewClient(new WebViewClient());
        wfacultades.loadUrl(webSite);

        WebSettings webSettings= wfacultades.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
