package com.mayab.patrones.strategy;

public class CommerceReport extends Report{

	public CommerceReport() {
		this.behaviour = new CommerceSorting();
	}

	@Override
	public void displayTransactions() {
		behaviour.sorting();
		
	}
	
	
}
