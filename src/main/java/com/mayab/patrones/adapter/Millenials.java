package com.mayab.patrones.adapter;

public class Millenials implements newPerson {

	public String fullName;
	public int age;
	
	public Millenials(String fullName, int age) {
		this.setFullName(fullName);
		this.setAge(age);
	}
	
	@Override
	public String getFullName() {
		return this.fullName;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public void setFullName(String name) {
		this.fullName = name;
		
	}

	@Override
	public void setAge(int age) {
		this.age = age;
		
	}

}
