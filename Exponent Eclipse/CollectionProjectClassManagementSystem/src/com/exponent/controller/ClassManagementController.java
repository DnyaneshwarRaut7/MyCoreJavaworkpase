package com.exponent.controller;

import java.util.Scanner;

import com.exponent.service.ClassManagementSystemService;
import com.exponent.serviceimpl.ClassMangementSystemServiceimpl;

public class ClassManagementController {

	static ClassManagementSystemService service = new ClassMangementSystemServiceimpl();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("****** Class Managment System Application Started *******");

		boolean flag = true;

		while (flag) {

			System.out.println("Menu ");
			System.out.println("1. Add course.. ");
			System.out.println("2. Display Courses");
			System.out.println("3. Add faculty");
			System.out.println("4. Display Faculty");
			System.out.println("5. Add Batch  ");
			System.out.println("6. Display Batch");
			System.out.println("7. Add Student");
			System.out.println("8. Display Student");
			System.out.println("9. Exit....");
			System.out.println("Select any number from above menu : ");
			System.out.println("....................................");

			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				service.addCource();
				break;
			case 2:
				service.displayCource();
				break;
			case 3:
				service.addFacult();
				break;
			case 4:
				service.dsplayFacult();
				break;
			case 5:
				service.addBatch();
				break;
			case 6:
				service.displayBatch();
				break;
			case 7:
				service.addStudent();
				break;
			case 8:
				service.displayStudent();
			case 9:
				System.out.println("Your Process is Ended...!");
				flag = false;
				break;
			default:
				System.out.println("Wrong choice...");
				break;

			}

		}

	}

}
