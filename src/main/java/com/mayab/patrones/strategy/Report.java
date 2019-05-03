package com.mayab.patrones.strategy;

public abstract class Report {

	public SortingBehaviour behaviour;
	
	public void setSortingBehaviour(SortingBehaviour behaviour) {
		this.behaviour = behaviour;
	}
	
	public abstract void displayTransactions();
}
