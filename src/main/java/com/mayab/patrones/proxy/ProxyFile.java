package com.mayab.patrones.proxy;

public class ProxyFile implements File {

	public FileImplemented file;
	public Usuario usuario;
	
	public ProxyFile(Usuario usuario) {
		this.file = new FileImplemented(); 
		this.usuario = usuario;
	}
	
	
	
	@Override
	public void borrar() {
		if(this.usuario.getTipo()) {
			this.file.borrar();
		}
		else {
			System.out.println("No tienes permiso para realizar esta operación");
		}
		
	}

	@Override
	public void escribir(String text) {
		this.file.escribir(text);
		
	}

	@Override
	public void leer() {
		this.file.leer();
		
	}

}
