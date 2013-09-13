package com.KeepingItSimpleApps.statscalculator.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class StatsServiceClientImplementation {
	
	private StatsServiceAsync service;

	public StatsServiceClientImplementation(String url) {
		this.service = GWT.create(StatsService.class);
		ServiceDefTarget endpoint = (ServiceDefTarget) this.service;
		endpoint.setServiceEntryPoint(url);
	}
	
	public void calculateStats(String input) {
		this.service.calculateStats(input, new DefaultCallback());
	}
	
	private class DefaultCallback implements AsyncCallback {

		// If there is an error with the response
		public void onFailure(Throwable caught) {
			System.out.print("Failure");
		}

		// If the response is received
		public void onSuccess(Object result) {
			System.out.print("Sucess");
		}
		
	}
	
}
