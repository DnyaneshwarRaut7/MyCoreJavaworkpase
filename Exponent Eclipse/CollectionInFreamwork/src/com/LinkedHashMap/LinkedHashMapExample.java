package com.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		        //key value pair store data 
				//insertion order  mention (KEY)
				// Only one null key present
				//Duplicate key not alcove
				
		
		
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		map.put("maili", 12);
		map.put("suraj", 78);
		map.put("bro",  87);
		map.put("dada", 77);
		map.put("sumit", 79);
		map.put("hii", 66);
		
		System.out.println(map);
		System.out.println(map.size());
	}

}
