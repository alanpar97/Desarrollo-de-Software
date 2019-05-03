package com.mayab.patrones.decorator;

public class Bacon extends Decorator {

	public Burger burger;
	
	public Bacon(Burger burger) {
		this.burger = burger;
	}
	
	@Override
	public String getDescription() {
		return burger.getDescription() + ", Bacon";
	}
	
	@Override
	public float cost() {
		return burger.cost() + 5;
	}

}
