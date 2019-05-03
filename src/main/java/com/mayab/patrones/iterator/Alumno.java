package com.mayab.patrones.iterator;

public class Alumno {
	public String nombre;
	public String id;
	
	public Alumno(String nombre, String id) {
		this.nombre = nombre;
		this.id = id;
	}
	
	public String getName() {
		return this.nombre;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void print() {
		System.out.println("Name: "+this.getName()+ " ID: "+this.getId());
	}
}
