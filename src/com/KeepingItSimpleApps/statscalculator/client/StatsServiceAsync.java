package com.KeepingItSimpleApps.statscalculator.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("stats")
public interface StatsServiceAsync {

	public void calculateStats(String input, AsyncCallback callback);
	
}
