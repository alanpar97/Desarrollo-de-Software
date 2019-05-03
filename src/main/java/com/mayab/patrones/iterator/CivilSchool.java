package com.mayab.patrones.iterator;
import java.util.Iterator;
import java.util.Queue;

public class CivilSchool {
	public String name;
	public Queue<Alumno> students;
	
	public CivilSchool(String name, Queue<Alumno> students) {
		this.name = name;
		this.students = students;
	}
	
	public Iterator createIterator() {
		return this.students.iterator();
	}
}
