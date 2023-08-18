package com.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
	
	
	// Duplicate value not alive
	// Ascending order  mention
	// not alcove null value
	

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<Integer>();
		

		set.add(22);
		set.add(11);
		set.add(33);
		set.add(99);
		set.add(44);
		set.add(33);
		set.add(55);
		//set.add(null);// Null pointer Exception
		
		System.out.println(set);
	}

}
