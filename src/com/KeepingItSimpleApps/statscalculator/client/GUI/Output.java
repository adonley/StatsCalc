package com.KeepingItSimpleApps.statscalculator.client.GUI;

import com.KeepingItSimpleApps.statscalculator.shared.StatsOutput;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Output extends Composite {

	private FlexTable output;
	private VerticalPanel vPanel = new VerticalPanel();
	
	public Output() {
		
		output = new FlexTable();
		
		// Add the label to the vPanel
		vPanel.add(output);
		
		// Initialize the widget
		initWidget(vPanel);
	}
	
	public void updateOutput(StatsOutput text) { 
		output.setText(0,0,"Average                      : " + text.getAverage());
	    output.setText(1,0,"Population Variance          : " + text.getPopVar());
	    output.setText(2,0,"Population Standard Deviation: " + text.getPopStdD());
	    output.setText(3,0,"Sample Variance              : " + text.getSampVar());
	    output.setText(4,0,"Sample Standard Deviation    : " + text.getSampStdD());
	    output.setText(5,0,"Number of Entries            : " + text.getNumberOfNums());
		
	} 
	
}
