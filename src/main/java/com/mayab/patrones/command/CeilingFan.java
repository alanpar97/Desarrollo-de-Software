package com.mayab.patrones.command;

public class CeilingFan {

		String location;
		
		public CeilingFan(String location) {
			this.location = location;
		}
		
		public void on() {
			System.out.println("Ceiling fan on in "+ this.location);
		}
		
		public void off() {
			System.out.println("Ceiling fan off in "+ this.location);
		}
}
