package com.mayab.patrones.observer;

public class Pasajero implements Observer {

	public Observable vuelo;
	public String nombre;
	
	
	public Pasajero(String nombre, Observable vuelo) {
		this.setNombre(nombre);
		this.setVuelo(vuelo);
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the vuelo
	 */
	public Observable getVuelo() {
		return vuelo;
	}

	/**
	 * @param vuelo the vuelo to set
	 */
	public void setVuelo(Observable vuelo) {
		this.vuelo = vuelo;
	}

	@Override
	public void update(String sala, String salida, String estado, String destino) {
		System.out.println("El vuelo será en la sala "+ sala);
		System.out.println("La salida del vuelo será a las "+ salida);
		System.out.println("El estado del vuelo es "+ estado);
		System.out.println("El destino del vuelo es "+ destino);
		
	}

}
