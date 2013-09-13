package com.KeepingItSimpleApps.statscalculator.client.GUI;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Output extends Composite {

	private Label output;
	private VerticalPanel vPanel = new VerticalPanel();
	
	public Output() {
		
		output = new Label("Output will go here.");
		
		// Add the label to the vPanel
		vPanel.add(output);
		
		// Initialize the widget
		initWidget(vPanel);
	}
	
	public void updateOutput(String text) { output.setText(text); } 
	
}
