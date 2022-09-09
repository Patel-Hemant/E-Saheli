package com.hemantpatel.e_saheli;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    WebView browser;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        browser = (WebView) findViewById(R.id.webview);

        String url = "https://gauravdwivedi1005.github.io/E-Saheli2/";
        browser.loadUrl(url);

        browser.getSettings().setLoadsImagesAutomatically(true);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.setWebViewClient(new WebViewClient());
        browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
    }

    @Override
    public void onBackPressed() {
        if (browser.canGoBack()) browser.goBack();
        else super.onBackPressed();
    }
}