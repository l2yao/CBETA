package com.cbeta.sutra;

import com.cbeta.sutra.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView webview = (WebView)this.findViewById(R.id.webView1);
		webview.setClickable(true);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("file:///android_asset/html/index.htm");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
