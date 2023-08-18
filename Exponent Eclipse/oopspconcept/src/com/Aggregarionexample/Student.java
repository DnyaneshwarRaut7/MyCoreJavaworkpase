package com.Aggregarionexample;

public class Student {

	int id;
	String name;
	
	Address address; // Entity reference

	public Student(int id, String name, Address address) { //Generate contature value
		
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
}
// Aggregation of Entity reference 