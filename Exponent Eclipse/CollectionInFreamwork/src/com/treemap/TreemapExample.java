package com.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreemapExample {

	public static void main(String[] args) {
		
		  //key value pair store data 
		//insertion order not mention 
		// null key not present
		//Duplicate key not alcove
		//Ascending order  mention

	Map<Integer,String> map = new TreeMap<Integer,String>();
	
	map.put(77, "a");
    map.put(23, "k");
	map.put(87, "l");
	map.put(11, "g");
	map.put(9, "f");
	//map.put(null, "a");//Nullpointer exception
 
	
	System.out.println(map);
	
	System.out.println(map.size());
	}

}
