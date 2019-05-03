package com.mayab.patrones.factoryMethod;

public class Triangle {

	public String type;
	public int[] sides = new int[3];
	
	public float perimeter() {
		float perimeter = 0;
		
		for(int i=0; i<this.sides.length;i++) {
			perimeter = perimeter + this.sides[i];
		}
		
		return perimeter;
	}
	
	public double area() {
		double perimeter = 0;
		for(int i=0; i<this.sides.length;i++) {
			perimeter = perimeter + this.sides[i];
		}
		
		double half = perimeter / 2;
		
		double area = half * (half-this.sides[0]) * (half-this.sides[1]) * (half-this.sides[2]);
		
		area = Math.sqrt(area);
		
		return area;
		
	}	
}

