package com.overriding;

public class C {

	public int display() {
		System.out.println("==== parent class display methpod===");

		return 10;
	}	
		public C m1()
		
		{
			System.out.println("=== parent class m1 method coverrant return type===");
			C c = new C();
			return c;
		}

	}


//pollymorphism in overriding method same return type covarrant return also