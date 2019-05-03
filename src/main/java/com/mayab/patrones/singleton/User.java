package com.mayab.patrones.singleton;

public class User {

	private String username;
	private String name;
	private boolean logged;
	private static User uniqueUser;
	
	private User(String username, String name) {
		this.username = username;
		this.name = name;
		this.logged = false;
	}
	
	public static User getUser(String username, String name) {
		if(uniqueUser == null) {
			System.out.println("Creating user.");
			uniqueUser = new User(username, name);
		}
		System.out.println("Getting existing user.");
		return uniqueUser;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean getLogged() {
		return this.logged;
	}
	
	public void logIn() {
		System.out.println("Loggin in...");
		this.logged = true;
	}
	
	public void logOut() {
		System.out.println("Loggin out...");
		this.logged = false;
	}
}
