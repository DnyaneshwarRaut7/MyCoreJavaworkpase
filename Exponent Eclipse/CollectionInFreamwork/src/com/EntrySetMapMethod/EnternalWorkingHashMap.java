package com.EntrySetMapMethod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EnternalWorkingHashMap {

	public static void main(String[] args) {
		
		
		

		Map<String,Long>mycontactdetails = new HashMap<String,Long>();
		
		mycontactdetails.put("mauli", 9146229448l);
    	mycontactdetails.put("suraj", 7038500982l);
    	mycontactdetails.put("rushi", 5555555555l);
    	
    Set<Map.Entry<String,Long>> setofkeysvalue = 	mycontactdetails.entrySet();// entrysetmethod
    
    
  Iterator<Map.Entry<String,Long>> itr = setofkeysvalue.iterator();
  
  while(itr.hasNext()) {
	  
	  
	  Map.Entry<String,Long> entries = itr.next();
	  
	  System.out.println(entries.getKey()+"  "+entries.getValue());
  }
		
	



	}

}
