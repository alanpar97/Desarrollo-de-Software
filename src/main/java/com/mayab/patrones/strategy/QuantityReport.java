package com.mayab.patrones.strategy;

public class QuantityReport extends Report {

	public QuantityReport() {
		this.behaviour = new QuantitySorting();
	}
	
	
	@Override
	public void displayTransactions() {
		behaviour.sorting();
		
	}
	
}
