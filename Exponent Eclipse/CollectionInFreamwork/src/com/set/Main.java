package com.set;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee(11,"mauli","pune");

		Employee e2 = new Employee(11,"mauli","pune");
		
		Set<Employee> setemployee = new HashSet<Employee>();
		
		setemployee.add(e);
		setemployee.add(e2);
		
		System.out.println(setemployee.size());
	}
	
	
	

}
