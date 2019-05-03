package com.mayab.patrones.command;

public class GarageDoor {

	public GarageDoor() {}
	
	public void up() {
		System.out.println("Garage door up.");
	}
	
	public void down() {
		System.out.println("Garage door down.");
	}
	
	public void stop() {
		System.out.println("Garage door stopped.");
	}
	
	public void lightOn() {
		System.out.println("Garage door's lights on.");
	}
	
	public void lightOff() {
		System.out.println("Garage door's lights off.");
	}
}
