package org.zezutom.androidprimer3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void updateText(View view) {
		EditText editText = (EditText) this.findViewById(R.id.inputName);
		TextView textView = (TextView) this.findViewById(R.id.welcome);
		textView.setText("Hello " + editText.getText() + "!");
	}
}
