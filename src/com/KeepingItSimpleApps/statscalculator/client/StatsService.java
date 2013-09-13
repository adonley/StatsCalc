package com.KeepingItSimpleApps.statscalculator.client;

import com.google.gwt.user.client.rpc.RemoteService;

public interface StatsService extends RemoteService {

	public String calculateStats(String input);
	
}
