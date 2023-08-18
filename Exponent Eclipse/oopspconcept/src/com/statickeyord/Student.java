package com.statickeyord;

public class Student {

	 int id;
	String name;
	static String collegeName = "EXPONANT";

	static {
		System.out.println("======= static block =====");
	}

	public static void m1() {
		System.out.println(collegeName);
		System.out.println("m1 static method ");
	}

	public void m2() {
		System.out.println(collegeName);
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {

		Student s = new Student();
		s.id = 111;
		s.name = "MAULI";
		// System.out.println(collegeName);
		// s.collegeName = "DYP";

		// System.out.println(collegeName);
		// s.collegeName = "FC";
		Student s2 = new Student();
		s2.id = 112;
		s2.name = "SUMIT";

		System.out.println(s.id + " " + s.name + " " + Student.collegeName);

		System.out.println(s2.id + " " + s2.name + " " + Student.collegeName);
	}
}
//Static keyword == use memory management