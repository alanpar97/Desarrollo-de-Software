package com.mayab.patrones.decorator;

public class Angus extends Burger{

	public Angus() {
		this.name = "Angus";
	}
	
	@Override
	public float cost() {
		return 15;
	}
	
	
}
