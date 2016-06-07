package com.cbeta.sutra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);

        WebView mContentView = (WebView) findViewById(R.id.webView);
        mContentView.setClickable(true);
        mContentView.getSettings().setJavaScriptEnabled(true);
        mContentView.loadUrl("http://tripitaka.cbeta.org/mobile/");
    }
}
