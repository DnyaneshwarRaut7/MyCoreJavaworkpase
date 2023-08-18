package com.overriding;

public class E {

	private void m1() // private accessmodifier within a same class
	{

		System.out.println("==== parent class m1 method====");
	}

	void m2() {

		System.out.println("=== parent m2 method==== ");
	}
	protected void m3() {
		
		System.out.println(" ====parent m3 method==== ");
		
	} 
	
	public void m4() {
		
		
		System.out.println("===parent class m4 method");
	}

}

//pollymorphism in overriding same method & access modifier same or greater than 