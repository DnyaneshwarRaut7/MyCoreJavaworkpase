package com.LinkHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkhashset {
	

	// Duplicate value not alive
	// Insertion order  mention
	// Only one null values
	
	public static void main(String[] args) {
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		set.add(22);
		set.add(11);
		set.add(33);
		set.add(99);
		set.add(44);
		set.add(33);
		set.add(55);
		//set.add(null);// null value exception
		//set.add(null);
		
		System.out.println(set);	
		
	Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			int i = itr.next();
			System.out.println(i);
		}
		
		System.out.println("-------- for each loop ------");
		
		for(int s:set) {
			System.out.println(s);
			
		}
	}

}
