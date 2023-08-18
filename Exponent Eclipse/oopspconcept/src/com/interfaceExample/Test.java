package com.interfaceExample;

public class Test implements I3 {

	@Override
	public void m2() {

		System.out.println("===== m2 method I2 interface");
	}

	@Override
	public void m1() {

		System.out.println("===== m1 method I2 interface");
	}

	@Override
	public void m3() {

		System.out.println("===== m3 method I3 interface");

	}

	public static void main(String[] args) {

		I1 i1 = new Test();
		System.out.println(i1.x);
		i1.m1();

		System.out.println("<<<<<< <<<<");

		I2 i2 = new Test(); // I1+I2
		System.out.println(i2.x);
		System.out.println(i2.y);
		i2.m1();
		i2.m2();

		System.out.println("((((((((())))))))))");

		I3 i3 = new Test(); // I1+I2+I3
		System.out.println(i3.x);
		System.out.println(i3.y);
		System.out.println(i3.z);
		i3.m1();
		i3.m2();
		i3.m3();
	}

}

//interface inheritance example
