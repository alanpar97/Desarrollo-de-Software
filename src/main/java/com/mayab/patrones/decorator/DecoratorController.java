package com.mayab.patrones.decorator;

public class DecoratorController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Burger veggie = new Veggie();
		Burger angus = new Angus();
		
		System.out.println(veggie.getDescription() + " $"+ veggie.cost());
		System.out.println(angus.getDescription() + " $"+ angus.cost());
		
		veggie = new Bacon(veggie);
		System.out.println(veggie.getDescription() + " $"+ veggie.cost());
		
		angus = new Guacamole(angus);
		System.out.println(angus.getDescription() + " $"+ angus.cost());

	}

}
