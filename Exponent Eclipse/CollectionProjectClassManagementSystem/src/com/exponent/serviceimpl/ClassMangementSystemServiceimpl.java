package com.exponent.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.exponent.model.Batch;
import com.exponent.model.Course;
import com.exponent.model.Facult;
import com.exponent.model.Student;
import com.exponent.service.ClassManagementSystemService;

public class ClassMangementSystemServiceimpl implements ClassManagementSystemService {

	Scanner sc = new Scanner(System.in);

	List<Course> clist = new ArrayList<Course>();
	List<Facult> flist = new ArrayList<Facult>();
	List<Batch> blist = new ArrayList<Batch>();
	List<Student> slist = new ArrayList<Student>();

	@Override
	public void addCource() {

		System.out.println("Add Course called....");

		System.out.println("Enter How many Courses add ");

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			Course c = new Course();

			System.out.println("Enter Course ID :");

			c.setCid(sc.nextInt());

			System.out.println("Enter Course Name:");
			c.setCname(sc.next());
			clist.add(c);
			
	System.out.println("Course Added Successfully.....");
		}

	}
	

	@Override
	public void displayCource() {

		System.out.println("Display course called...");

		for (Course course : clist) {

			System.out.println("course:   ID" + course.getCid() + "  ,CName" + course.getCname());

		}
	}

	@Override
	public void addFacult() {

		System.out.println("Add Facult called....");

		System.out.println("Enter How many Faculat add ");

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			Facult f = new Facult();

			System.out.println("Enter facult ID :");

			f.setFid(sc.nextInt());

			System.out.println("Enter facult Name:");
			f.setFname(sc.next());
			// clist.add(f);

			displayCource();

			System.out.println("Select Cource ID from above");

			int choice = sc.nextInt();
			for (Course course : clist) {

				if (choice == course.getCid()) {
					f.setC(course);
					break;

				}
			}
			flist.add(f);

		}
	}

	@Override
	public void dsplayFacult() {

		System.out.println("dsplayFacult called.... ");

		for (Facult f : flist) {
			System.out.println(f);

		}
	}

	@Override
	public void addBatch() {

		System.out.println("Add Batch called....");

		System.out.println("Enter How many Batch add ");

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			Batch b = new Batch();

			System.out.println("Enter Batch ID :");

			b.setBid(sc.nextInt());

			System.out.println("Enter Batch Name:");
			b.setBname(sc.next());

			dsplayFacult();
			System.out.println("Select Facult ID from above");

			int choice = sc.nextInt();
			for (Facult f : flist) {
				
				//System.out.println(f);
				b.setF(f);
			}

			blist.add(b);

		}
	}

	@Override
	public void displayBatch() {

		System.out.println("display batched....");

		for (Batch b : blist) {

			System.out.println(b);
		}
	}

	@Override
	public void addStudent() {

		System.out.println("Add student called....");

		System.out.println("Enter How many Student add ");

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			Student s = new Student();

			System.out.println("Enter Student ID :");

			s.setSid(sc.nextInt());

			System.out.println("Enter Student Name:");
			s.setSname(sc.next());

			displayBatch();
			System.out.println("Select Batch ID from above");

			int choice = sc.nextInt();
			for (Batch b : blist) {
				s.setB(b);
				
				

			}

			slist.add(s);

		}
		

	}

	@Override
	public void displayStudent() {

		for (Student s : slist) {

			System.out.println(s);

		}
	}

}
