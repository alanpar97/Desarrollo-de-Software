package com.mayab.patrones.proxy;

public class ProxyController {

	public static void main(String[] args) {
		
		Usuario userB = new Usuario("Benjamin",false); //No es un superusuario
		Usuario userA = new Usuario("Alan", true); //Es un superusuario
		
		
	
		
		ProxyFile proxyB = new ProxyFile(userB); //El proxy del usuario Benjamin
		ProxyFile proxyA = new ProxyFile(userA); //El proxy del usuario Alan
		
		userB.addProxy(proxyB);
		userA.addProxy(proxyA);
		
		userB.getProxy().borrar();
		userA.getProxy().borrar();
		

	}

}
