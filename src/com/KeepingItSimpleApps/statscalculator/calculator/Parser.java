package com.KeepingItSimpleApps.statscalculator.calculator;

import java.util.LinkedList;
import java.util.Scanner;

import com.KeepingItSimpleApps.statscalculator.shared.StatsOutput;

public class Parser {
	
	public static StatsOutput readInput(String input) {
		
		int i = 0;
		LinkedList<Double> values = new LinkedList<Double>();
		
		Scanner s = new Scanner(input);
		//.useDelimiter(",");
		input.replaceAll(","," ");
		input.replaceAll("  ", " ");
		
		while(s.hasNextDouble()) {
			values.add(new Double(s.nextDouble()));
		}
		
		double [] valueArray = new double[values.size()]; 
		
		// Put the values into an array
		for(Double d: values) {
			valueArray[i] = d.doubleValue();
			i++;
		}
		
		return (StatsCalculator.calc(valueArray));
	}
	
	public static String formatOutput(StatsOutput input) { 
		String output = new String("");
		output = 
		  "Average                      : " + input.getAverage() + "\n" 
		+ "Population Variance          : "+ input.getPopVar() + "\n"
		+ "Population Standard Deviation: " + input.getPopStdD() + "\n"
		+ "Sample Variance              : " + input.getSampVar() + "\n" 
		+ "Sample Standard Deviation    : " + input.getSampStdD() + "\n"
		+ "Number of Entries            : " + input.getNumberOfNums();
		return output;
	}
}
