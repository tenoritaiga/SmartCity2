package com.smartcity.redux.fragments;

import com.smartcity.redux.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ViewWaterConsumptionFragment extends Fragment {
	
	public static final String ARG_SECTION_NUMBER = "section_number";
	
	public ViewWaterConsumptionFragment() {
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, 
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_my_water_result, container, false);
		
		/*// init example series data
		GraphViewSeries exampleSeries = new GraphViewSeries(new GraphViewData[] {
				new GraphViewData(1, 2.0d)
				, new GraphViewData(2, 1.5d)
				, new GraphViewData(3, 2.5d)
				, new GraphViewData(4, 1.0d)
		}); 
		BarGraphView graphView = new BarGraphView(
				getActivity() // context
				, "GraphViewDemo" // heading
		);
		graphView.setDrawValuesOnTop(true);
		
		graphView.addSeries(exampleSeries); // data
		
		LinearLayout layout = (LinearLayout) rootView.findViewById(R.id.graph_water);
		layout.addView(graphView);*/
		
		/*TableLayout tableLayout = (TableLayout) rootView.findViewById(R.id.waterResultsTable);
		TableRow tableRow = new TableRow(getActivity());
		tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));
		
		TextView text1 = new TextView(getActivity());
		text1.setText("01/19/2014");
		text1.setPadding(15, 0, 15, 0);
		text1.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
		
		TextView text2 = new TextView(getActivity());
		text2.setText("142");
		text2.setPadding(15, 0, 15, 0);
		text2.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
				
		tableRow.addView(text1);
		tableRow.addView(text2);
		
		tableLayout.addView(tableRow);*/
		
		return rootView;
	}
}
