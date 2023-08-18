package com.HashmapExample;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args) {
		
		//key value pair store data 
		//insertion order not mention 
		// Only one null key present
		//Duplicate key not alcove
		
		
	Map<String,Integer> map = new HashMap<String,Integer>();	
	
	map.put("A", 22);
	map.put("M", 44);
	map.put("j", 55);
	map.put("K", 88);
	map.put("l", 99);
	map.put("B", 56);
	map.put(null, 78);// null key 0 index
	
	System.out.println(map);
	
	System.out.println(map.size());
	}

}
