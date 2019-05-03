package com.mayab.patrones.adapter;

import java.util.Calendar;

public class PersonAdapter implements oldPerson {

	public newPerson person;
	
	
	
	public PersonAdapter(newPerson person) {
		
		this.person = person;
		
	}
	
	@Override
	public String getName() {
		String[] fullName = person.getFullName().split("\\s");
		return(fullName[0]);
	}

	@Override
	public String getLastName() {
		String[] fullName = person.getFullName().split("\\s");
		return(fullName[1]);
	}

	@Override
	public int getBirthDate() {
		return(Calendar.getInstance().get(Calendar.YEAR) - person.getAge());
	}

	@Override
	public void setName(String name) {
		String[] fullName = person.getFullName().split("\\s");
		person.setFullName(name + " "+ fullName[1]);
		
	}

	@Override
	public void setLastName(String lastName) {
		String[] fullName = person.getFullName().split("\\s");
		person.setFullName(fullName[0] +" "+ lastName);
		
	}

	@Override
	public void setBirthDate(int birthDate) {
		person.setAge(Calendar.getInstance().get(Calendar.YEAR) - birthDate);
		
	}

}
