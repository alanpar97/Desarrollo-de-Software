package com.mayab.patrones.proxy;

public class FileImplemented implements File {

	
	public FileImplemented() {}
	
	@Override
	public void borrar() {
		System.out.println("El archivo se ha borrado.");
		
	}

	@Override
	public void escribir(String text) {
		System.out.println("Se ha agregado el siguiente texto: "+text);
		
	}

	@Override
	public void leer() {
		System.out.println("Leyendo archivo...");
		
	}

}
