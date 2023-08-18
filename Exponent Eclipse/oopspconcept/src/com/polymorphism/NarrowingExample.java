package com.polymorphism;

public class NarrowingExample {
	
	
	public static void m1(Object object) {
		
		System.out.println("=== object ====");
		
	}
	 public static void m1(String string) {
		 
		 System.out.println("==== string ====");
	 }
	 
	// public static void m1(Integer i)
	 //{
	 //System.out.println("==== integer ====");
	 //}

	public static void main(String[] args) {
		 
		m1("dsr");
		m1(7);
		
	}

}
