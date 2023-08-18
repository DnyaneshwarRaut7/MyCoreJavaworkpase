package com.CollectionClassExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClassExample {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<String>();

		Collections.addAll(nameList, "mauli", "suraj", "rushi", "ritesh");// multiple data add

		System.out.println(nameList);

		List<String> name = new ArrayList<String>();

		name.add("mauli");
		name.add("suraj");
		name.add("rushi");
		name.add("ritesh");
		name.add("Dnyanu");

		Collections.sort(name);// assending order data
		System.out.println(name);

		Collections.reverse(name);// reverse order data
		System.out.println(name);

		Collections.shuffle(name);// kasa pan data store kartay
		System.out.println(name);

		System.out.println(Collections.frequency(name, "mauli")); // size print kartay
		
		//list

		name=Collections.unmodifiableList(name);// unsupported operaction Exception 
		
		name.add("tushar");// onely primitve data type use 

		System.out.println(name);
		// list
		
		Collections.synchronizedList(name);// onely one threads added
		
		System.out.println(name);
		
		// set
		
	//	Collections.unmodifiableSet(null)
		// map
		//Collections.unmodifiableMap(null);
		
		//set
		//Collections.synchronizedSet(null;)
		
		//map
	//	Collections.synchronizedMap(null);
		
		
	}

}
