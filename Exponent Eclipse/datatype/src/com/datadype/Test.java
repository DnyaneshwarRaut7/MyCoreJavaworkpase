package com.datadype;

public class Test {
//global variable
//primitive data type
//integer	
	byte b = 127;
	short s = 138;
	int i = 56567;//0
	long l = 68657657;

	// floating number
	float f = 687.98768f;//0.0
	double d = 9989.6647786d;

	// boolean
	boolean flag;//false

	// character
	char c = 'h';//_

	// non primitive data type
	String name = "MAULI";//null

	public void m1() {

		System.out.println("==m1 method==");
		byte s = 1;
		short g = 11;
		int j = 111;
		long k = 9146229448l;
		float m = 98.47f;
		double d = 9999.99999d;
		boolean flag = true;
		char p = 'd';
		String name = "DNYANESHWAR";
		String name1 = "SAMBHAJI";
		String name2 = "RAUT";

		System.out.println(s);
		System.out.println(g);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		System.out.println(d);
		System.out.println(flag);
		System.out.println(p);
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
	}

	public void m2() {

		System.out.println("==m2 method==");

		Test t1 = new Test();
		System.out.println(t1.d);
		System.out.println(t1.s);
		System.out.println(t1.i);
		System.out.println(t1.l);
		System.out.println(t1.f);
		System.out.println(t1.b);
		System.out.println(t1.flag);
		System.out.println(t1.c);
		System.out.println(t1.name);
		

	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("==primitive or non primitive data type==");
		System.out.println(t.b);
		System.out.println(t.s);
		System.out.println(t.i);
		System.out.println(t.l);
		System.out.println(t.f);
		System.out.println(t.d);
		System.out.println(t.flag);
		System.out.println(t.c);
		System.out.println(t.name);
		t.m1();
		t.m2();
		
	}

}
