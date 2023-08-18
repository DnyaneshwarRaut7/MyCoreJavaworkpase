package com.KeySetMapMethod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeySetMapMethod {
	
	// 1. Keyset();  set
	// 2. entryset(); set
	// 3. values(); 

	public static void main(String[] args) {

	Map<Integer,String> map = new HashMap<Integer,String>();
	
	map.put(10, "mauli");
	map.put(11, "suraj");
	map.put(12, "sumit");
	map.put(13, "tushar");
	map.put(14, "avi");
	map.put(15, "banti");
	
	System.out.println(map);
	
	System.out.println(map.size());
	
	System.out.println("------------ using iterator interface ----------");
	
	Set<Integer> key = map.keySet();// keysetmethod
	System.out.println(key);
	
	Iterator<Integer>itr = key.iterator();
	
	while(itr.hasNext()) {
		
		Integer i = itr.next();
		
		System.out.println("   Keys  "+ i+"   valu "  +map.get(i));
	}
	
	System.out.println("==========For each loop ===========");
	
	for (Integer ii : key) {
		
		System.out.println(ii+"  "+ map.get(ii));
		
	}
	
	}

}
