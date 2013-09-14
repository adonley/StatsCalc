package com.KeepingItSimpleApps.statscalculator.shared;

import java.io.Serializable;

public class StatsOutput implements Serializable {

	private static final long serialVersionUID = -1215105258909870567L;
	private double numberOfNums;
	private double average;
	private double sampVar;
	private double popVar;
	private double sampStdD;
	private double popStdD;
	
	public StatsOutput() {
		numberOfNums = 0;
		average = 0;
		sampVar = 0;
		popVar = 0;
		sampStdD = 0;
		popStdD = 0;
	}
	
	public double getSampStdD() {
		return sampStdD;
	}
	public void setSampStdD(double sampStdD) {
		this.sampStdD = sampStdD;
	}
	public double getPopStdD() {
		return popStdD;
	}
	public void setPopStdD(double popStdD) {
		this.popStdD = popStdD;
	}
	public double getSampVar() {
		return sampVar;
	}
	public void setSampVar(double sampVar) {
		this.sampVar = sampVar;
	}
	public double getPopVar() {
		return popVar;
	}
	public void setPopVar(double popVar) {
		this.popVar = popVar;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public double getNumberOfNums() {
		return numberOfNums;
	}
	public void setNumberOfNums(double numberOfNums) {
		this.numberOfNums = numberOfNums;
	}
	
}