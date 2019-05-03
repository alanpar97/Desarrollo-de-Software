package com.mayab.patrones.iterator;

import java.util.*;


public class IteratorController {

	public static void main(String[] args) {
		
		Alumno alan = new Alumno("Alan Paredes", "279105");
		Alumno sebas = new Alumno("Sebastian Montoya", "278345");
		Alumno benji = new Alumno("Benjamin Monterroza", "335786");
		Alumno luis = new Alumno("Luis Oliva", "568793");
		Alumno pamela = new Alumno("Pamela Torres", "367548");
		Alumno antonio = new Alumno("Antonio Osuna", "289876");
		Alumno karen = new Alumno("Karen Arenas", "557685");
		Alumno emilio = new Alumno("Emilio Hayashi", "246376");
		
		//ArrayList de alumnos
		ArrayList<Alumno> informaticStudents = new ArrayList<Alumno>();
		informaticStudents.add(alan); 
		informaticStudents.add(sebas);
		
		//Lista de alumnos
		List<Alumno> industrialStudents = new ArrayList<Alumno>();
		industrialStudents.add(benji);
		industrialStudents.add(luis);
		
		//Array de alumnos
		Alumno[] mechatronicStudents = {pamela, antonio};
		
		//Cola de alumnos
		Queue<Alumno> civilStudents = new LinkedList<Alumno>();
		civilStudents.add(karen);
		civilStudents.add(emilio);
		
		//Crear escuelas
		InformaticSchool informatic = new InformaticSchool("Informatic", informaticStudents);
		IndustrialSchool industrial = new IndustrialSchool("Industrial", industrialStudents);
		MechatronicSchool mechatronic = new MechatronicSchool("Mechatronic", mechatronicStudents);
		CivilSchool civil = new CivilSchool("Civil", civilStudents);
		
		//Crear facultad
		EngineeringFaculty engineeringFaculty = new EngineeringFaculty(informatic, industrial, mechatronic, civil);
		
		engineeringFaculty.printFacultyStudents();
		
		
	}

}
