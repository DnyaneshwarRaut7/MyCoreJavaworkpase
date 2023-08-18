package com.exponent.studentmanagementsystem.controller;

import com.exponent.studentmanagementsystemserviceimpl.collade.Collage;
import com.expont.studentmanagment.model.Student;

public class Universisty {

	public static void main(String[] args) {

		Collage c = new Collage(); // collage object

		Student[] studentarry = c.addstudentdetails(); // arry

		System.out.println("=== for each loop =====");

		for (Student s : studentarry) {// for each loop

			System.out.println(s.id + " " + s.name + " " + s.address);
		}
	}

}

//student managment system Arry project & return type & for loop