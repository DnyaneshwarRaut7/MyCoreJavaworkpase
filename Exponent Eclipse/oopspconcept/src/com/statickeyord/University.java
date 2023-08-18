package com.statickeyord;

public class University {
	
   static int id = 11;

	public static void main(String[] args) {

		System.out.println(Student.collegeName);
		// System.out.println(Student.id);
		Student.m1();
		
		System.out.println(id);
		University u = new University ();
		System.out.println(u.id);
		System.out.println(University.id);
	}

}
//Static keyword