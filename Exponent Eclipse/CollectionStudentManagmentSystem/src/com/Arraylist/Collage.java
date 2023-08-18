package com.Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collage {

	Scanner sc = new Scanner(System.in);

	public List<Student> addstudentdetail() {

		System.out.println("How many Student you want Add :");

		int choice = sc.nextInt();
		List<Student> liststudent = new ArrayList<Student>();

		for (int i = 0; i < choice; i++) {

			Student s = new Student();

			System.out.println("enter your Student id :");

			int id = sc.nextInt();
			s.setId(id);

			System.out.println("Enter your Student Nmae:");

			String name = sc.next();
			s.setName(name);

			System.out.println("Enter your Student Address:");

			String address = sc.next();
			s.setAddress(address);

			System.out.println("Enter your mobail no:");

			long mno = sc.nextLong();
			s.setMno(mno);

			// s.id = 1;
			// s.name = "mauli";
			// s.address = "pune";

//			Student s1 = new Student();
//
//			s1.id = 2;
//			s1.name = "suraj";
//			s1.address = "rajuri";
//
//			Student s2 = new Student();
//
//			s2.id = 3;
//			s2.name = "dnyaneshwar";
//			s2.address = "a.nager";

			// List<String> liststudent = new ArrayList<String>();

			liststudent.add(s);
			// liststudent.add(s1);
			// .addres/.add(s2);

		}

		return liststudent;
	}
}