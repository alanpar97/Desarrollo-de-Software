package com.mayab.patrones.strategy;

public class DateReport extends Report {

	public DateReport() {
		this.behaviour = new DateSorting();
	}
	
	@Override
	public void displayTransactions() {
		this.behaviour.sorting();
		
	}

	
}
