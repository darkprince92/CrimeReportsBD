package com.lazybox.crimereportsbd.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.lazybox.crimereportsbd.R;
import com.lazybox.crimereportsbd.utils.JsonParsing;

public class SplashActivity extends Activity {
	private final int SPLASH_DISPLAY_LENGTH = 1000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		//getActionBar().hide();
		
		new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Main-Activity. */
                Intent mainIntent = new Intent(SplashActivity.this,JsonParsing.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
	}
}
