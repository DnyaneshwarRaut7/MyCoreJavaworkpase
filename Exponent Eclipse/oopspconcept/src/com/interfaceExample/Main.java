package com.interfaceExample;

public class Main implements I {

	@Override
	public void m1() {

		System.out.println("m1 implements in main class");
	}

	@Override
	public void m2() {

		System.out.println("m2 implements method in main class ");
	}

	public void m3() {

		System.out.println("m3 method of main class");
	}

	public static void main(String[] args) {

		System.out.println(" ==== indirect object of interface ====");

		I i = new Main2();// indirect object // loose coupling
		System.out.println(i.i);
		System.out.println(i.j);
		i.m1();
		i.m2();
		System.out.println("<<<<<< implemented class object >>>>>");

		Main2 main = new Main2(); // Implement object //tite coupling support
		System.out.println(i.i);
		System.out.println(i.j);
		main.m1();
		main.m2();
		//main.m3();
	}
}
// abstraction of abstract class & interface
