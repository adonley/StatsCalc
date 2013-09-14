package com.KeepingItSimpleApps.statscalculator.client;

import com.KeepingItSimpleApps.statscalculator.shared.StatsOutput;
import com.google.gwt.user.client.rpc.RemoteService;

public interface StatsService extends RemoteService {

	public StatsOutput calculateStats(String input);
	
}
