package com.mayab.patrones.template;

public class Persona extends Catalogo{
	public String nombre;
	public String direccion;
	public int edad;
	
	public Persona(String nombre, String direccion, int edad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
	}

	@Override
	boolean validarDatos(int valor) {
		if(valor >18) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	void error() {
		System.out.println( "La persona es menor a 18 años");
	}
}
