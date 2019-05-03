package com.mayab.patrones.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class InformaticSchool {
	public ArrayList<Alumno> students;
	public String name;
	
	public InformaticSchool(String name, ArrayList<Alumno> students) {
		this.name = name;
		this.students = students;
	}
	
	public void iterate() {
		System.out.println("List of students at "+ this.name + " School");
		for(int i=0; i<this.students.size(); i++) {
			this.students.get(i).print();
		}
	}
	
	public Iterator createIterator() {
		return students.iterator();
	}
}
