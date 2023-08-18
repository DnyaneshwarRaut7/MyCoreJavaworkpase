package com.returntype;

public class Demo {

	public void m1() {

		System.out.println("m1 method Demo class");
	}

	//return data type & class

	public int m2() {
		return 20;
	}

	public String m3() {
		return "MAULI";
	}

	public double m4() {
		return 90.99;
	}

	public char m5() {
		return 'k';
	}

	public boolean m6() {
		return true;
	}

	public Student addStudentDetails() {

		Student s = new Student();
		s.id = 9999;
		s.name = "DNYANESHWAR";
		s.address = "pune";
		return s;
    }
	 public Employe addEmoloyeDetails() {
		 
		 Employe e = new Employe();
		 e.rno = 987;
		 e.name = "suraj";
		 e.address = "RAJURI";
		 e.r = 9146229448l;
		 return e;
	 }
	 public static void main(String[] args) {

		Demo d = new Demo();

		d.m1();
		int a = d.m2();
		System.out.println(a);
		String b = d.m3();
		System.out.println(b);
		double c = d.m4();
		System.out.println(c);
		char f = d.m5();
		System.out.println(f);
		boolean h = d.m6();
		System.out.println(h);
		
		System.out.println("....................................");

		Student s2 = d.addStudentDetails();
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.address);
		
		System.out.println("..........................................");
		
		Employe e2 = d.addEmoloyeDetails();
		System.out.println(e2.rno);
		System.out.println(e2.name);
		System.out.println(e2.address);
		System.out.println(e2.r);
	}

}
