package com.mayab.patrones.iterator;

import java.util.Iterator;

public class EngineeringFaculty {
	InformaticSchool informatic;
	IndustrialSchool industrial;
	MechatronicSchool mechatronic;
	CivilSchool civil;
	
	public EngineeringFaculty(InformaticSchool informatic, IndustrialSchool industrial, MechatronicSchool mechatronic, CivilSchool civil) {
		this.informatic = informatic;
		this.industrial = industrial;
		this.mechatronic = mechatronic;
		this.civil = civil;
	}
	
	public void printSchoolStudents(Iterator iterator) {
		while(iterator.hasNext()) {
			Alumno student = (Alumno)iterator.next();
			student.print();
		}
	}
	
	public void printFacultyStudents() {
		System.out.println("Informatic School");
		this.printSchoolStudents(informatic.createIterator());
		System.out.println("Industrial School");
		this.printSchoolStudents(industrial.createIterator());
		System.out.println("Mechatronic School");
		this.printSchoolStudents(mechatronic.createIterator());
		System.out.println("Civil School");
		this.printSchoolStudents(civil.createIterator());
	}
	
	
}
