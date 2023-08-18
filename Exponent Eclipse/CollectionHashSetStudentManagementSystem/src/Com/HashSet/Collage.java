package Com.HashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collage {

	Scanner sc = new Scanner(System.in);

	public Set<Student> addStudentdetails() {

		System.out.println("How many Student you want Add :");

		int choice = sc.nextInt();
		Set<Student> Setstudent = new HashSet<Student>();

		for (int i = 0; i < choice; i++) {

			Student s = new Student();
			System.out.println("Enter your student id:");

			int id = sc.nextInt();
			s.setId(id);
			System.out.println("Enter your Student Nmae:");

			String name = sc.next();
			s.setSname(name);

			System.out.println("Enter your Student Address:");

			String address = sc.next();
			s.setAddress(address);
			
			System.out.println("Enter your Student mark");
			
			float mark = sc.nextFloat();
			s.setMark(mark);

			System.out.println("Enter your mobail no:");

			long mno = sc.nextLong();
			s.setMno(mno);

		}
		return Setstudent;
	}
}
