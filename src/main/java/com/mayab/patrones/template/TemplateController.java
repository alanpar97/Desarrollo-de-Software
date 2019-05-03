package com.mayab.patrones.template;

public class TemplateController {

	public static void main(String[] args) {
		
		Producto producto1 = new Producto("0025467", 30);
		Producto producto2 = new Producto("0025437", 5);
		
		Persona persona1 = new Persona("Alan", "Calle 17A",20);
		Persona persona2 = new Persona("Sebas", "Calle 5A",10);
		
		System.out.println("Producto 1");
		producto1.update(45);
		System.out.println("Producto 2");
		producto2.update(9);
		
		System.out.println("Persona 1");
		persona1.update(45);
		System.out.println("Persona 2");
		persona2.update(9);

	}

}
