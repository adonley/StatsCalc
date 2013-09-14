package com.KeepingItSimpleApps.statscalculator.client;

import com.KeepingItSimpleApps.statscalculator.client.GUI.MainGUI;
import com.KeepingItSimpleApps.statscalculator.shared.StatsOutput;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class StatsServiceClientImplementation {
	
	private StatsServiceAsync service;
	private MainGUI mainGUI;

	public StatsServiceClientImplementation(String url) {
		System.out.println("URL: " + url);
		this.service = GWT.create(StatsService.class);
		ServiceDefTarget endpoint = (ServiceDefTarget) this.service;
		endpoint.setServiceEntryPoint(url);
		
		mainGUI = new MainGUI(this);
	}
	
	public void calculateStats(String input) {
		this.service.calculateStats(input, new DefaultCallback());
	}
	
	public MainGUI getGUI() { return mainGUI; }
	
	private class DefaultCallback implements AsyncCallback<Object> {

		// If there is an error with the response
		public void onFailure(Throwable caught) {
			System.out.print("Failure");
		}

		// If the response is received
		public void onSuccess(Object result) {
			if(result instanceof StatsOutput) {
				StatsOutput output = (StatsOutput) result;
				mainGUI.updateOutput(output);
			}
		}
		
	}
	
}
