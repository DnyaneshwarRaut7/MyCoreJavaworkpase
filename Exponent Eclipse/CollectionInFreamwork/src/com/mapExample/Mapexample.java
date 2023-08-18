package com.mapExample;

import java.util.HashMap;
import java.util.Map;

public class Mapexample {

	public static void main(String[] args) {
		
		//key value pair store data 
		//insertion order not mention 
		// Only one null value present
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(11, "mauli");
		map.put(22,"sumit");
		map.put(33, "tushar");
		map.put(44, "suraj");
		map.put(null, "dsr");// null 0 index
		
		System.out.println(map);
		
		System.out.println(map.size());//s
		System.out.println(map.get(11));// key present value print
		System.out.println(map.containsKey(44));//present true// not present false
		System.out.println(map.containsValue("dsr"));//present true// not present false
		System.out.println(map.get(99));//key present not  null
	
	
	
	
	}

}
