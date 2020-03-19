package com.example.pregradomestria;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
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

        wfacultades.setDownloadListener(new DownloadListener()
        {
            public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                //for downloading directly through download manager
                final DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
                request.allowScanningByMediaScanner();

                request.setMimeType(mimetype);
                //------------------------COOKIE------------------------
                String cookies = CookieManager.getInstance().getCookie(url);
                request.addRequestHeader("cookie", cookies);
                //------------------------COOKIE------------------------
                request.addRequestHeader("User-Agent", userAgent);
                request.setDescription("Downloading file...");
                request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimetype));
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(url, contentDisposition, mimetype));
                final DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);

                new Thread("Browser download") {
                    public void run() {
                        dm.enqueue(request);
                    }
                }.start();
            }
        });
    }
}
