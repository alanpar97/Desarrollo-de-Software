package com.mayab.patrones.decorator;

public abstract class Burger {
	
	public String name = "Unkown burger";
	
	public String getDescription() {
		return name;
	}
	
	public abstract float cost();
	
}
