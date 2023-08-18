 package com.exponent.studentmanagementsystemserviceimpl.collade;

import com.expont.studentmanagment.model.Student;

public class Collage {

	public Student[] addstudentdetails() {

		Student s = new Student();

		s.id = 1;
		s.name = "mauli";
		s.address = "pune";

		Student s1 = new Student();

		s1.id = 2;
		s1.name = "suraj";
		s1.address = "rajuri";

		Student s2 = new Student();

		s2.id = 3;
		s2.name = "dnyaneshwar";
		s2.address = "a.nager";

		Student[] arryofstudent = { s, s1, s2 };

		return arryofstudent;

	}

}
//student managment system Arry project & return type