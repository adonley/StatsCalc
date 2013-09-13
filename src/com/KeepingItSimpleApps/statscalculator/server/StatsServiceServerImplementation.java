package com.KeepingItSimpleApps.statscalculator.server;

import com.KeepingItSimpleApps.statscalculator.client.StatsService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class StatsServiceServerImplementation extends RemoteServiceServlet implements StatsService {

	public String calculateStats(String input) {
		return input;
	}

}
