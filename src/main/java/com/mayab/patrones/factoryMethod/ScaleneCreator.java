package com.mayab.patrones.factoryMethod;

public class ScaleneCreator extends TriangleCreator {

	@Override
	public Triangle createTriangle(String type) {
		if(type.equals("Scalene")) {
			return new ScaleneTriangle();
		}
		else {
			return null;
		}
	}

}
