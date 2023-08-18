package com.Aggregarionexample;

public class Test {

	public static void main(String[] args) {
		
		Address address = new Address("pune","Jamkhed",413204);
		
		Student s = new Student(10,"mauli",address);
		
		Student s1 = new Student (20,"Suraj", address);
		

		Address address2 = new Address("A.nager","Jamkhed",413201);
		

		
		Student s2 = new Student (30,"Dnyaneshwar", address2);
		
		
		System.out.println(s.id+" "+s.name+" "+s.address.LocalAddress+" "+s.address.PerAddress+" "+s.address.pincode);
		System.out.println(s1.id+" "+s1.name+" "+s1.address.LocalAddress+" "+s1.address.PerAddress+" "+s1.address.pincode);
		
		System.out.println(s2.id+" "+s2.name+" "+s2.address.LocalAddress+" "+s2.address.PerAddress+" "+s2.address.pincode);
		
	}

}
//Aggregation of Entity reference 