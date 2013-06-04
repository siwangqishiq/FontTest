package com.xinlan.fonttest;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView text1, text2, text3;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text1 = (TextView) findViewById(R.id.text1);
		text2 = (TextView) findViewById(R.id.text2);
		text3 = (TextView) findViewById(R.id.text3);
		
		Typeface face1 = Typeface.createFromAsset(getAssets(), "fonts/Croissant.otf");
		text1.setTypeface(face1);
		
		Typeface face2 = Typeface.createFromAsset(getAssets(), "fonts/young.otf");
		text2.setTypeface(face2);
		
		Typeface face3 = Typeface.createFromAsset(getAssets(), "fonts/mini.TTF");
		text3.setTypeface(face3);
	}

}// end class
