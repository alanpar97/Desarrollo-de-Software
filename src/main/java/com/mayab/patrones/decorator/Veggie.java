package com.mayab.patrones.decorator;

public class Veggie extends Burger{

	public Veggie() {
		this.name = "Veggie";
	}
	
	@Override
	public float cost() {
		return 25;
	}
	
	
}
