package com.KeepingItSimpleApps.statscalculator.client.GUI;

import com.KeepingItSimpleApps.statscalculator.client.StatsServiceClientImplementation;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;

public class StatsForm extends Composite {
	
	private TextArea input;
	private VerticalPanel vPanel = new VerticalPanel();
	private Button calculate;
	private StatsServiceClientImplementation serviceImpl;
	
	public StatsForm(StatsServiceClientImplementation serviceImpl) {
		
		com.google.gwt.dom.client.Element matrixDiv = Document.get().getElementById("statsForm");
		String clientWidth = Math.floor((matrixDiv.getClientWidth()) * .8) + "px";
		String clientHeight = Math.floor((matrixDiv.getClientWidth()) * .3) + "px";
		
		this.serviceImpl = serviceImpl;
		
		input = new TextArea();
		input.setWidth(clientWidth);
		input.setHeight(clientHeight);
		input.setStylePrimaryName("resize:none;");
		
		calculate = new Button("Calculate");
		calculate.addClickHandler(new CalculateHandler());
		
		// Add buttons to the vertical panel
		vPanel.add(input);
		vPanel.add(calculate);
		
		// Initialize the widget
		initWidget(vPanel);
	}
	
	// Gets the user's input
	String getInput() { return input.getText(); }
	
	// Clear the user's input
	void clearInput() { input.setText(""); }
	
	private class CalculateHandler implements ClickHandler {
		public void onClick(ClickEvent event) {
			
			// Ask the server to calculate the statistics
			serviceImpl.calculateStats(input.getText());
			
		}
	}

}