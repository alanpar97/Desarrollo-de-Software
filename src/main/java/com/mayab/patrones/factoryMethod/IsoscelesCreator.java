package com.mayab.patrones.factoryMethod;

public class IsoscelesCreator extends TriangleCreator{

	@Override
	public Triangle createTriangle(String type) {
		if(type.equals("Isosceles")) {
			return new IsoscelesTriangle();
		}
		else {
			return null;
		}
		
	}

}
