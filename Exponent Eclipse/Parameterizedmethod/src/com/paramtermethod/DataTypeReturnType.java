package com.paramtermethod;

public class DataTypeReturnType {

	public static void main(String[] args) {
		System.out.println("***************Main Method Started************");

		DataTypeReturnType pm = new DataTypeReturnType();
		pm.display();
		byte b = pm.m1();
		System.out.println(b);
		short s = pm.m2();
		System.out.println(s);
		int i = pm.m3();
		System.out.println(i);
		double d = pm.m4();
		System.out.println(d);
		float f = pm.m5();
		System.out.println(f);
		long l = pm.m6();
		System.out.println(l);
		String s1 = pm.m7();
		System.out.println(s1);

		System.out.println("******main method completed********");
	}
	// byte,short, INT ,long ,double,float,char,boolean ,String custom class Data
	// type

	public void display() {
		System.out.println("WELCOME TO EXPONANT CLASS");
	}

	public byte m1() {
		System.out.println("m1 reaturn method");
		return 127;
	}

	public short m2() {
		System.out.println("m2 return method");
		return 10000;
	}

	public int m3() {
		System.out.println("m3 return type method");
		return 99991943;
	}

	public double m4() {
		return 99999999;
	}

	public float m5() {
		return 6.5f;
	}

	public long m6() {
		return 585888899;
	}

	public String m7() {
		return "MAULI";
	}

}
