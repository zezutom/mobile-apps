package org.zezutom.androidprimer2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void buttonPressed(View view) {
		Intent i = new Intent(this, SwitchedActivity.class);
		startActivity(i);
	}

}
