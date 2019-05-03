package com.mayab.patrones.factoryMethod;

public class FactoryMethodController {

	public static void main(String[] args) {
		
		TriangleCreator equilateralCreator = new EquilateralCreator();
		TriangleCreator isoscelesCreator = new IsoscelesCreator();
		TriangleCreator scaleneCreator = new ScaleneCreator();

		
		Triangle triangle = equilateralCreator.createTriangle("Equilateral");
		
		System.out.println("Type: "+ triangle.type);
		System.out.println("Perimeter: " + triangle.perimeter());
		System.out.println("Area: " + triangle.area());
		
		triangle = isoscelesCreator.createTriangle("Isosceles");
		
		System.out.println("Type: "+ triangle.type);
		System.out.println("Perimeter: " + triangle.perimeter());
		System.out.println("Area: " + triangle.area());
		
		triangle = scaleneCreator.createTriangle("Scalene");
		
		System.out.println("Type: "+ triangle.type);
		System.out.println("Perimeter: " + triangle.perimeter());
		System.out.println("Area: " + triangle.area());
		
	}

}
