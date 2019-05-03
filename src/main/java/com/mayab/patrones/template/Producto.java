package com.mayab.patrones.template;

public class Producto extends Catalogo{
	public String codigoBarras;
	public int precio;
	
	public Producto(String codigoBarras, int precio) {
		this.codigoBarras = codigoBarras;
		this.precio = precio;
	}

	@Override
	boolean validarDatos(int valor) {
		if (valor>10){
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	void error() {
		System.out.println("El producto tiene un precio menor a $10");
	}
	
	
}
