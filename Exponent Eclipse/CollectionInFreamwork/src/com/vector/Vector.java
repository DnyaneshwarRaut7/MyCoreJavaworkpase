package com.vector;

import java.util.List;

public class Vector {

	public static void main(String[] args) {

		List<String> animal = (List<String>) new Vector();

		animal.add("mumbai");
		animal.add("pune");
		animal.add("Nashik");
		animal.add("A.nager");

		System.out.println("Animals :" + animal);

	}

}
