package com.comparableandComparter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solutioncomparable {

	public static void main(String[] args) {

		Student s = new Student(15, "mauli", "pune");
		Student s1 = new Student(22, "suraj", "jamkhed");
		Student s2 = new Student(9, "rushi", "pcmc");
		Student s3 = new Student(89, "ritesh", "vashi");
		Student s4 = new Student(55, "tushar", "tel");
		Student s5 = new Student(44, "sumit", "rajuri");

		List<Student> listofstudent = new ArrayList<Student>();

		listofstudent.add(s);
		listofstudent.add(s1);
		listofstudent.add(s2);
		listofstudent.add(s3);
		listofstudent.add(s4);
		listofstudent.add(s5);

		System.out.println("------- Before sorting id -----------");

		for (Student ss : listofstudent) {

			System.out.println(ss.sid + " " + ss.sname + " " + " " + ss.saddress);

		}

		Collections.sort(listofstudent);

		System.out.println("----- After sorting id -----");

		for (Student ss : listofstudent) {

			System.out.println(ss.sid + " " + ss.sname + " " + ss.saddress);

		}

	}

}
