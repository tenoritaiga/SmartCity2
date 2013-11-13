package com.smartcity.redux;

import com.google.android.gms.maps.MapView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {

//	GridView gridView;

//	static final String[] MOBILE_OS = new String[] { "Android", "iOS",
//			"Windows", "Blackberry" };

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_activity);

	}
	
	public void startMapActivity(View view){
		Intent intent = new Intent(MainActivity.this,AirMapActivity.class);
		MainActivity.this.startActivity(intent);
	}
	
	public void startSettingsActivity(View view){
		Intent intent = new Intent(MainActivity.this,SettingsActivity.class);
		MainActivity.this.startActivity(intent);
	}
	
	public void startTrafficActivity(View view){
		Intent intent = new Intent(MainActivity.this,Traffic_map.class);
		MainActivity.this.startActivity(intent);
	}
	
	public void startProfileActivity(View view) {
		Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
		MainActivity.this.startActivity(intent);
	}

}