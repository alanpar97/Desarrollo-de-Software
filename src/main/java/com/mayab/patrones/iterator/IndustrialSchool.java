package com.mayab.patrones.iterator;
import java.util.List;
import java.util.Iterator;

public class IndustrialSchool {
	public String name;
	public List<Alumno> students;
	
	public IndustrialSchool(String name, List<Alumno> students) {
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
