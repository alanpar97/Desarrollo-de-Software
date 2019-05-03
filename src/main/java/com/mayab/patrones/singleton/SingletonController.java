package com.mayab.patrones.singleton;

public class SingletonController {

	public static void main(String[] args) {
		User alan = User.getUser("alanpar97", "Alan Paredes");

		System.out.println("User: "+ alan.getUsername());
		System.out.println("Name: "+alan.getName());
		alan.logIn();
		System.out.println(alan.getName() + " is logged: "+alan.getLogged());
		alan.logOut();
		System.out.println(alan.getName() + " is logged: "+alan.getLogged());
		
		//Here we'll prove that there is only one instance.
		User test = User.getUser("kikonMontoya97", "Sebastian Montoya");
		System.out.println("User: "+ test.getUsername());
		System.out.println("Name: "+test.getName());
		alan.logIn();
		System.out.println(test.getName() + " is logged: "+test.getLogged());
		alan.logOut();
		System.out.println(test.getName() + " is logged: "+test.getLogged());
	}

}
