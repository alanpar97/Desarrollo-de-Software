package com.mayab.patrones.template;

public abstract class Catalogo {

	final void update(int valor) {
		
		this.leerDatos();
		if(this.validarDatos(valor)) {
			guardar();
		}
		else {
			this.error();
		}
	}
	
	abstract boolean validarDatos(int valor);
	
	abstract void error();
	
	public void leerDatos() {
		System.out.println("Leyendo datos...");
	}
	
	public void guardar() {
		System.out.println("Datos guardados.");
	}
	
	
}
