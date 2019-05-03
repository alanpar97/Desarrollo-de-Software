package com.mayab.patrones.factoryMethod;

public class EquilateralCreator extends TriangleCreator {

	@Override
	public Triangle createTriangle(String type) {
		if(type.equals("Equilateral")) {
			return new EquilateralTriangle();
		}
		else {
			return null;
		}
	}

}
