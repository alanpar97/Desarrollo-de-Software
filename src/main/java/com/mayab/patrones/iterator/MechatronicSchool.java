package com.mayab.patrones.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class MechatronicSchool {
	public String name;
	public Alumno[] students;
	
	public MechatronicSchool(String name, Alumno[] students) {
		this.name = name;
		this.students = students;
	}
	
	public void iterator() {
		System.out.println("List of students at "+ this.name + " School");
		for(int i=0; i<this.students.length; i++) {
			this.students[i].print();
		}
	}
	
	public Iterator createIterator() {
		return Arrays.asList(students).iterator();
	}
}
