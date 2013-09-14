package com.KeepingItSimpleApps.statscalculator.calculator;

import com.KeepingItSimpleApps.statscalculator.shared.StatsOutput;

public class StatsCalculator {

	public static StatsOutput calc(double [] input) {
		
		StatsOutput output = new StatsOutput();
		double average = 0, sampVar = 0, popVar = 0;
		
		for(int i = 0; i < input.length; i++) {
			average = average + input[i];
		}
		
		average = average / input.length;
		
		for(int i = 0; i < input.length; i++) {
			input[i] = (input[i]-average)*(input[i]-average);
			sampVar += input[i];
			popVar += input[i];
		}
		
		// Calculate Variance
		popVar = popVar / (input.length);
		sampVar = sampVar / (input.length - 1);
		
		// Assemble output object
		output.setAverage(average);
		output.setNumberOfNums(input.length);
		output.setPopVar(popVar);
		output.setSampVar(sampVar);
		output.setPopStdD(Math.sqrt(popVar));
		output.setSampStdD(Math.sqrt(sampVar));
		
		return output;
	}
	
}