package com.mayab.patrones.proxy;

public class Usuario {

	public String nombre;
	public boolean tipo;
	public ProxyFile proxy;
	
	public Usuario(String nombre, boolean tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	
	public void addProxy(ProxyFile proxy) {
		this.proxy = proxy;
	}
	
	public ProxyFile getProxy() {
		return this.proxy;
	}
	
	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public boolean getTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}

	
	
	
	
}
