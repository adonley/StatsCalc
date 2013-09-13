package com.KeepingItSimpleApps.statscalculator.client.GUI;

import com.KeepingItSimpleApps.statscalculator.client.StatsServiceClientImplementation;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainGUI extends Composite {

	private VerticalPanel vPanel = new VerticalPanel();
	private StatsForm form;
	private Output output;
	private StatsServiceClientImplementation serviceImpl;
	
	public MainGUI(StatsServiceClientImplementation serviceImpl) {
		
		this.serviceImpl = serviceImpl;
		
		// Create new stats form and output label
		form = new StatsForm(serviceImpl);
		output = new Output();
		
		// Add stats form to the vertical panel
		vPanel.add(form);
		vPanel.add(output);
		
		initWidget(vPanel);
		
	}
	
	public void updateOutput(String text) { output.updateOutput(text); }
	
}
