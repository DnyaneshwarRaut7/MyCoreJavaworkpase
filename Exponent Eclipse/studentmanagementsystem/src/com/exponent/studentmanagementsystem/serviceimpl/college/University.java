package com.exponent.studentmanagementsystem.serviceimpl.college;

import com.exponent.studentmanagementsystem.model.Student;

public class University {

	 Student s = new Student();
	 Student s1 = new Student();
	 Student s2 = new Student();
	 Student s3 = new Student();
	 Student s4 = new Student();
	 Student s5 = new Student();
	
	
	public static void main(String[] args) {
	
	 College college = new College();	
	 Student student = college.addStudentDetails();
	 System.out.println(student.sid + " " + student.sname);
	 
	 System.out.println("==============");
	 
	 University u = college.addAllStudentDetails();
	 System.out.println(u.s.sid+ " "+u.s.sname+" "+u.s.saddress+" "+u.s.mno+" "+u.s.div+" "+u.s.per);
	 System.out.println(u.s1.sid+ " "+u.s1.sname+" "+u.s1.saddress+" "+u.s1.mno+" "+u.s1.div+" "+u.s1.per);
	 System.out.println(u.s2.sid+ " "+u.s2.sname+" "+u.s2.saddress+" "+u.s2.mno+" "+u.s2.div+" "+u.s2.per);
	 System.out.println(u.s3.sid+ " "+u.s3.sname+" "+u.s3.saddress+" "+u.s3.mno+" "+u.s3.div+" "+u.s3.per);
	 System.out.println(u.s4.sid+ " "+u.s4.sname+" "+u.s4.saddress+" "+u.s4.mno+" "+u.s4.div+" "+u.s4.per);
	 System.out.println(u.s5.sid+ " "+u.s5.sname+" "+u.s5.saddress+" "+u.s5.mno+" "+u.s5.div+" "+u.s5.per);
	}
	
}
