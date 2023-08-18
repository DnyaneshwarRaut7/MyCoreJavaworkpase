package com.paramtermethod;

public class Test {

	int k = 10;

	public void m1() {
		System.out.println("without parameter method");
		System.out.println("*******************");
	}
	// data type :primitive or non primitive classes

	public void m2(int i) {
		System.out.println("single parameter method");
		System.out.println(i);
	}

	public void m3(String s, int i) {
		System.out.println("doubal parameter method");
		System.out.println(s + "  " + i);
	}

	public void m4(double d) {
		System.out.println("m4 method of test class");
		System.out.println(d);
	}

	public void m5(boolean b, char c, int i, double d, String s) {
		System.out.println("m5 mehod");
		System.out.println(b + " " + c + " " + i + " " + d + " " + s);

	}

	public void addStudentDetails(Student s) {
		System.out.println(s.id + " " + s.name + " " + s.address);
	}

	public void addEmployeeDetails(Employee e) {
		System.out.println(e.eid + " " + e.ename);

	}

	public static void main(String[] args) {

		Test t = new Test();
		t.m1();
		t.m2(77);
		t.m3("MAULI", 88);
		t.m4(99.899);
		t.m5(true, 'd', 8888, 744688477, "Dnyaneshwar");

		Student s = new Student();
		s.id = 101;
		s.name = "MAULI";
		s.address = "PUNE";

		t.addStudentDetails(s);

		Employee e = new Employee();
		e.eid = 222;
		e.ename = "abc";

		t.addEmployeeDetails(e);
	}

}
