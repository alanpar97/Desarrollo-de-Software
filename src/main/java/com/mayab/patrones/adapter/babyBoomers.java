package com.mayab.patrones.adapter;

public class babyBoomers implements oldPerson {
	
	public String name;
	public String lastName;
	public int birthDate;
	
	
	public babyBoomers(String name, String lastName, int birthDate) {
		this.setName(name);
		this.setLastName(lastName);
		this.setBirthDate(birthDate);
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public String getLastName() {
		return this.lastName;
	}
	@Override
	public int getBirthDate() {
		return this.birthDate;
	}
	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}
	@Override
	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
		
	}
	
	
}
