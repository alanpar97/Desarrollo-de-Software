package com.mayab.patrones.observer;

public class ObserverController {

	public static void main(String[] args) {
		
		Vuelo vuelo = new Vuelo("A1", "14:00", "On Time", "Venezuela");
		Pasajero alan = new Pasajero("Alan Paredes", vuelo);
	
		
		vuelo.addObserver(alan);
		
		vuelo.setEstado("Aboarding");
		vuelo.setSalida("15:30");
		
		
	}

}
