package com.mayab.patrones.factoryMethod;

public abstract class TriangleCreator {

	public abstract Triangle createTriangle(String type);
	
	public Triangle measures(String type){
		  Triangle triangle = createTriangle(type);
		  
	      System.out.println("Perimeter: "+triangle.perimeter());
	      System.out.println("Area: "+triangle.area());
	        
	      return triangle;
	}
}
