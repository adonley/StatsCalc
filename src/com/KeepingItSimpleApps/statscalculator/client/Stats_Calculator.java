package com.KeepingItSimpleApps.statscalculator.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

public class Stats_Calculator implements EntryPoint {

	private StatsServiceClientImplementation client;
	
	public void onModuleLoad() {
		
		client = new StatsServiceClientImplementation(GWT.getModuleBaseURL() + "stats");
		RootPanel.get("statsForm").add(client.getGUI());
		
	}
}
