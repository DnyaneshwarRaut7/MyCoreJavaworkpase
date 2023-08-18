package com.exponent.studentmanagementsystem.serviceimpl.college;

import com.exponent.studentmanagementsystem.model.Student;

public class College {

	public Student addStudentDetails() {
		Student s = new Student();
		s.sid = 201;
		s.sname = "DNYANESHWAR";
		s.saddress = "JAMKHED";
		s.mno = 9146229448l;
		s.div = 'A';
		s.per = 87.98f;
		
		return s ;
	}

	public University addAllStudentDetails() {

		University u = new University();
		// student s = new student();
		u.s.sid = 201;
		u.s.sname = "DNYANESHWAR";
		u.s.saddress = "JAMKHED";
		u.s.mno = 9146229448l;
		u.s.div = 'A';
		u.s.per = 87.98f;

		// student s1 = new student();
		u.s1.sid = 202;
		u.s1.sname = "SUMIT";
		u.s1.saddress = "JAMKHED";
		u.s1.mno = 8600427528l;
		u.s1.div = 'A';
		u.s1.per = 88.98f;

		// student s2 = new student();
		u.s2.sid = 203;
		u.s2.sname = "TUSHAR";
		u.s2.saddress = "A-nager";
		u.s2.mno = 9767574570l;
		u.s2.div = 'A';
		u.s2.per = 89.89f;

		// student s3 = new student();
		u.s3.sid = 204;
		u.s3.sname = "UTKARSH";
		u.s3.saddress = "PUNE";
		u.s3.mno = 9284899403l;
		u.s3.div = 'A';
		u.s3.per = 89.98f;

		// student s4 = new student();
		u.s4.sid = 205;
		u.s4.sname = "PRASHANT";
		u.s4.saddress = "PARNER";
		u.s4.mno = 7575754757l;
		u.s4.div = 'A';
		u.s4.per = 86.98f;

		// student s5 = new student();
		u.s5.sid = 206;
		u.s5.sname = "KISHOR";
		u.s5.saddress = "PUNE";
		u.s5.mno = 9756567583l;
		u.s5.div = 'A';
		u.s5.per = 90.98f;

		return u;
	}

}
