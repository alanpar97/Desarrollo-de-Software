package com.mayab.patrones.decorator;

public class Guacamole extends Decorator {

	public Burger burger;
	
	public Guacamole(Burger burger) {
		this.burger = burger;
	}
	
	@Override
	public String getDescription() {
		return burger.getDescription() + ", Guacamole";
	}
	
	@Override
	public float cost() {
		return burger.cost() + 12;
	}

}
