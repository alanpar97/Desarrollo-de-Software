package com.mayab.patrones.strategy;

public class CategoryReport extends Report{
	
	public CategoryReport() {
		this.behaviour = new CategorySorting();
	}
	
	
	@Override
	public void displayTransactions() {
		behaviour.sorting();
		
	}

}
