package com.mayab.patrones.command;

public class Stereo {
	
	String location;
	
	public Stereo(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println("Stereo on in "+ this.location);
	}
	
	public void off() {
		System.out.println("Stereo off in "+ this.location);
	}
	
	public void setCD() {
		System.out.println("CD set in "+ this.location);
	}
	
	public void setDVD() {
		System.out.println("DVD set in "+ this.location);
	}
	
	public void setRadio() {
		System.out.println("Radio set in "+ this.location);
	}
	
	public void setVolume(int volume) {
		System.out.println("Radio volume set to " + volume +" in "+this.location);
	}
}
