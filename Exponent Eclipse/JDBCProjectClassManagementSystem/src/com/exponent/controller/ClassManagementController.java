package com.exponent.controller;

import java.util.Scanner;

import com.exponent.service.ClassManagementSystemService;
import com.exponent.serviceimpl.ClassManagementSystemServiceimpl;

public class ClassManagementController {
	
	static ClassManagementSystemService service = new ClassManagementSystemServiceimpl();


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

			System.out.println("****** Class Managment System JDBC Connection Application Started *******");

			boolean flag = true;

			while (flag) {

				displayMenu();

				System.out.println("Select any number from above menu :- ");
				int ch = sc.nextInt();

				if (ch != 9) 

					executeParticularFlow(ch);
				else
					flag = false;
			}
			System.out.println("**ClassManagement System JDBC Connection Application terminated.. **");

		}

		private static void executeParticularFlow(int ch) {
			switch (ch) {
			case 1:
				service.addCourcetoDatabase();
				break;
			case 2:
				service.displayCourcefromDatabase();
				break;
			case 3:
				service.addFaculttoDatabase();
				break;
			case 4:
				service.displayFacultfromDatabase();
				break;
			case 5:
				service.addBatchtoDatabase();
				break;
			case 6:
				service.displayBatchfromDatabase();
				break;
			case 7:
				service.addStudenttoDatabase();
				break;
			case 8:
				service.displayStudentfromDatabase();
			default:

				break;
			}

		}

		public static void displayMenu() {

			System.out.println("Menu :-");
			System.out.println("1. Add Cource :- ");
			System.out.println("2. Display Courses :-");
			System.out.println("3. Add faculty :-");
			System.out.println("4. Display Faculty :-");
			System.out.println("5. Add Batch :-  ");
			System.out.println("6. Display Batch :- ");
			System.out.println("7. Add Student :-");
			System.out.println("8. Display Student :- ");
			System.out.println("9. Exit.....");

		}


	
	
	}


