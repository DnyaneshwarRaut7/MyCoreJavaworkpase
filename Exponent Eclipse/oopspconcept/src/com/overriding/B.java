package com.overriding;

public class B extends A {

	@Override
	public void show(int i) {

		System.out.println("==== overried show  method in child class==== ");

	}

	public static void main(String[] args) {

		A a = new A(); // parent class object
		a.show(9);
		System.out.println(77);
		a.m1("mauli");

		A a1 = new B();
		a1.show(88);
		System.out.println(55);
	}

}
//pollymorphism in overriding method always same parameter