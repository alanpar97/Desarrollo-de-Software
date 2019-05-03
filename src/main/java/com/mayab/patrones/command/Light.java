package com.mayab.patrones.command;

public class Light {
	
	String location;
	
	public Light(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println("Lights on in "+ this.location);
	}
	
	public void off() {
		System.out.println("Lights off in "+this.location);
	}
}
