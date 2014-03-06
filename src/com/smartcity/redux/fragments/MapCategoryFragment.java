package com.smartcity.redux.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.maps.SupportMapFragment;
import com.smartcity.redux.R;

public class MapCategoryFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//super.onCreate(savedInstanceState);
		//setContentView(R.layout.fragment_map_category);
		View root = inflater.inflate(R.layout.fragment_map_category, null);
		Button button = (Button)root.findViewById(R.id.airmapButton);
		
		button.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {

	            SupportMapFragment frag = new AirMapFragment();
	            FragmentTransaction ft = getFragmentManager().beginTransaction();
	            ft.replace(R.id.frame_container, frag);
	            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
	            ft.addToBackStack(null);
	            ft.commit();
	         }
		     });
		
		return root;
	}
}
