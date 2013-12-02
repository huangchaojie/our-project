package com.example.activity_01;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class Activity01 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_01);
		TextView TextView1 = (TextView)findViewById(R.id.TextView1);
		Button Button1 = (Button)findViewById(R.id.Button1);
		TextView1.setText("My First TextView");
		Button1.setText("My First Button");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity01, menu);
		return true;
	}

}
