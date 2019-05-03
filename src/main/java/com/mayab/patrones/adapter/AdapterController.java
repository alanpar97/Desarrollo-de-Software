package com.mayab.patrones.adapter;

public class AdapterController {

	public static void main(String[] args) {
		
		babyBoomers baby = new babyBoomers("José", "Cetina", 1943);
		
		Millenials mille = new Millenials("Alan Paredes", 21);
		
		oldPerson adapted = new PersonAdapter(mille);
		
		System.out.println("BabyBoomer: " + baby.getName()+" " +baby.getLastName() +" "+ baby.getBirthDate());
		System.out.println("Millenial: "+ mille.getFullName()+" "+mille.getAge());
		System.out.println("PersonAdapter: Name: "+adapted.getName()+" LastName: "+adapted.getLastName()+" Birth Date: "+adapted.getBirthDate());
		
		
	}

}
