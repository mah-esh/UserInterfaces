package com.mahesh;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.mahesh.layout1.R;

public class Activity1 extends Activity{


/*private TextView txt;
 * (comment2)
private Typeface typeface;
*/
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.layout1);
	
	
	/*txt = (TextView) findViewById(R.id.textView1);
	
//(comment2)	
	typeface = Typeface.createFromAsset(getAssets(), "Roboto-BlackItalic.ttf");
	txt.setText("Hello Mahesh Learn Android In depth");
	txt.setTypeface(typeface);*/
	findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		Toast.makeText(Activity1.this,"Button Clicked", Toast.LENGTH_SHORT).show();	
		}
	});
}
}
