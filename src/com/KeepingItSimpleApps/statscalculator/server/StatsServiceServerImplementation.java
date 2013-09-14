package com.KeepingItSimpleApps.statscalculator.server;

import com.KeepingItSimpleApps.statscalculator.calculator.Parser;
import com.KeepingItSimpleApps.statscalculator.client.StatsService;
import com.KeepingItSimpleApps.statscalculator.shared.StatsOutput;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class StatsServiceServerImplementation extends RemoteServiceServlet implements StatsService {

	public StatsOutput calculateStats(String input) {
		return Parser.readInput(input);
	}

}
