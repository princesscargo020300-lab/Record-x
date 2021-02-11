package com.Recordx;



import android.app.Activity; 
import android.os.Bundle; 
import android.text.method.ScrollingMovementMethod; 
import android.widget.TextView; 

public class ListEmployee extends Activity { 

	@Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
		setContentView(R.layout.listemployee); 

		TextView textView = findViewById(R.id.view_data); 

		DbHelper db = new DbHelper(this); 

		String data = db.getEmployee(); 
		textView.setText(data); 
		textView.setMovementMethod(new ScrollingMovementMethod()); 
	} 
} 


